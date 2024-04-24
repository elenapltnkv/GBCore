package gb4.garage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vink> garage = new ArrayList<>();
        Car car1= new Car("BMW", 200);
        car1.value= 230;
        Car car2= new Car("Lexus", 400);
        car2.value= 450;
        Car car3= new Car("Moskvich", 180);
        car3.value= 185;
        garage.add(new Bike("Java", 10));
        garage.add(new Car("Lada", 120));
        garage.add(new Car("Nissan", 200));


        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(car1, car2, car3));
        garage.add(car1);
        garage.add(car2);
        garage.add(car3);

//        Collections.sort(garage);
//        System.out.println(garage);
        Collections.sort(cars,new CarComporatorByValue());
        System.out.println(cars);



    }
}
