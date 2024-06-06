package gb9;

public class Person {
    private String name;
    private int age;
    private Position position;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position=" + position +
                '}';
    }


    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Person(String name, int age, Position position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }


    enum Position {
        ENGENEER, DIRECTOR, MANAGER
    }
}
