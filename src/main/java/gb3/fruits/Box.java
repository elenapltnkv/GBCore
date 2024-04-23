package gb3.fruits;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{
    // Класс Box, в который можно складывать фрукты.
    // Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;

    //Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра.
    // true – если их массы равны, false в противоположном случае.
    // Можно сравнивать коробки с яблоками и апельсинами;
    private List<T> fruitList;


    private double totalWeight;
    private Object Box;

    public Box() {
        this.fruitList = new ArrayList<>();
    }

    public void addFruit(Apple fruit) {
        fruitList.add((T) fruit);

        totalWeight = totalWeight + fruit.getWeight();
    }

    public void addFruit(Orange fruit) {
        fruitList.add((T) fruit);

        totalWeight = totalWeight + fruit.getWeight();
    }

    public float getTotalWeight() {
        return (float) this.totalWeight;
    }
    public boolean compare(Box anotherBox) {
        return Box==anotherBox;
    }

    private void getWeight() {
    }
}
