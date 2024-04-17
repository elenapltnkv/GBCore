package gb1;

import java.util.Objects;

public class Cat extends Animal {

    public Cat(String name, int age, String color) {
        super(name, age, color);
    }
    @Override
    public void speak(){
        System.out.println("mew-mew");
    }
    //boolean isWild;
}
