package gb3;

public class NumberBox<T extends Number> {


    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public NumberBox(T... array) {
        this.array = array;
    }

    private T[] array;

    public double avg() {
        double sum = 0.0;
        for (T num : array) {
            sum += num.doubleValue();
        }
        return sum / array.length;
    }
    public double compareBox(){

        return 0;
    }
    public boolean isTavgD(NumberBox<?> box){
        return avg()== box.avg();
    }
    public static <U extends Number> U getFirstNumber(NumberBox<U> box){
        return box.array[0];
    }

    public static void main(String[] args) {
        NumberBox<Integer> numberBoxes = new NumberBox<>(3, 5, 9, 12);
        System.out.println(numberBoxes.avg());
        System.out.println(getFirstNumber(numberBoxes));
        NumberBox<Integer> numberBoxes2 = new NumberBox<>(3, 5, 9, 12);
        NumberBox<Double> dobleBox = new NumberBox<>(2.3, 5.5, 8.1);
        System.out.println(dobleBox.avg());
        System.out.println(numberBoxes.isTavgD(dobleBox));
    }
}
