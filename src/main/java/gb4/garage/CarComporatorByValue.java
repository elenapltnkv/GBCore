package gb4.garage;

import java.util.Comparator;

public class CarComporatorByValue implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        return c1.value - c2.power;
    }
}
