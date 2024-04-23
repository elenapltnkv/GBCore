package gb3.fruits;

import java.util.Arrays;

public abstract class Fruit {
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }

    private float weight;
}
