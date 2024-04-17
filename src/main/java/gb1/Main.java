package gb1;

public class Main {
    public static void main(String[] args) {
        //Animal animal2 = new Cat("Boris", 2, "red");
        Cat cat = new Cat("Murzik", 1, "black");
        //cat2.setAge(-3);
        Wolf wolf = new Wolf("Akella", 5, "black");
        Animal animal = new Wolf("Sery", 3, "gray");
        System.out.println(wolf.toString());
        wolf.speak();
        System.out.println(cat.toString());
        cat.speak();


    }
}
