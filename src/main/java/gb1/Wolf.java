package gb1;

public class Wolf extends Animal implements CanSwim {
    public Wolf(String name, int age, String color) {
        super(name, age, color);
    }

    private int swimmingSpeed;

    @Override
    public void voice() {
        System.out.println(name + " say" + " Uuuuuuuuuuuuuu");
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public double swim(int lenth) {
        System.out.println(name + " i can swim");
        return (double) lenth / swimmingSpeed;
    }

}
