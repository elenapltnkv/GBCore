package gb3;

public class GenBox <T>{
    public GenBox(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "GenBox{" +
                "object=" + object +
                '}';
    }

    private T object;


    public static void main(String[] args) {
        GenBox<Integer> genBox = new GenBox<>(10);
        GenBox<String> genBox1 = new GenBox<>("15");
        GenBox<Double> genBox2 = new GenBox<>(3.5);
        System.out.println(genBox.getObject()+genBox2.getObject());
    }
}
