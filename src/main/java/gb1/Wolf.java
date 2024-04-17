package gb1;

public class Wolf extends Animal{
    public Wolf(String name, int age, String color) {
        super(name, age, color);
    }
    @Override
    public void speak(){
        System.out.println("Uuuuuuuuuuuuuu");
    }
}
