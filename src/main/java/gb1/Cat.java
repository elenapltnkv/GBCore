package gb1;

public class Cat extends Animal implements CanSwim {

    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    private int swimmingSpeed;

    @Override
    public void voice() {
        System.out.println(name + " say" + " mew-mew");
    }




    public double swim(int length) {
        System.out.println("Я кот я плыву");
        return (double) length /swimmingSpeed;
    }

    //boolean isWild;
}
