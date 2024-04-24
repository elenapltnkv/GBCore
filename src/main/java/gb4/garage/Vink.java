package gb4.garage;

public class Vink implements Comparable<Vink>{
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Vink{" +
                "model='" + model + '\'' +
                ", power=" + power +
                '}';
    }

    protected String model;
    protected int power;
    public Vink(String model, int power) {
        this.model = model;
        this.power = power;
    }


    @Override
    public int compareTo(Vink vink) {
        return power- vink.power;
    }
}
