package gb4.garage;

public class Car extends Vink{
    public int value;

    @Override
    public String toString() {
        return "Car{" +
                "value=" + value +
                ", model='" + model + '\'' +
                ", power=" + power +
                '}';
    }

    public Car(String model, int power) {
        super(model, power);
    }


}
