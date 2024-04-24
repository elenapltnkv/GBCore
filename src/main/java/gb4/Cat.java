package gb4;

import java.util.*;

public class Cat implements Comparable<Cat>{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Bonny", 1);
        Cat cat2 = new Cat("Bonny", 1);
        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
        System.out.println(cat1.equals(cat2));

        HashSet<Cat> hashSet = new HashSet<>(Arrays.asList(cat1, cat2));
        System.out.println(hashSet);

        LinkedHashSet<Integer> hashSet1 = new LinkedHashSet<>(Arrays.asList(1, 2, 3 ,8, 15,4));
        System.out.println(hashSet1);
        LinkedHashSet<Integer> integerLinkedHashSet = new LinkedHashSet<>(Arrays.asList(1, 2, 3 ,8, 15,4));
        System.out.println(integerLinkedHashSet);

        TreeSet<Cat> treeSet = new TreeSet<>(Arrays.asList(cat1, cat2, new Cat("Tommy", 5), new Cat("Tomfeyyemy", 7)));
        System.out.println(treeSet);

        TreeSet<Cat> cats = new TreeSet<>(new CatByNameLenthComporator());
        cats.add(new Cat("Ghdfgd",1));
        cats.add(new Cat("Garfild",9));
        cats.add(new Cat("Gomer Simpson",9));

        System.out.println(cats);
    }

    @Override
    public int compareTo(Cat cat) {
        return age- cat.age;
    }
}
