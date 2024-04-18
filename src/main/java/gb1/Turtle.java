package gb1;

public class Turtle extends  Animal implements CanSwim{
    public Turtle(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void voice() {
        System.out.println("говорит tttt");
    }

    private int swimmingSpeed;

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public double swim(int lenght) {
        System.out.println(name + " I swim slowly");
        return (double) lenght / swimmingSpeed;
    }
}
