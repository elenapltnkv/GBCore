package gb3.fruits;

import java.util.Arrays;

public abstract class Fruit {
    public Fruit(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    private double totalWeight;
}
