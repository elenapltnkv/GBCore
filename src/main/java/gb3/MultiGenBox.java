package gb3;

public class MultiGenBox <T, U>{
    public MultiGenBox(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public void setObj1(T obj1) {
        this.obj1 = obj1;
    }

    public U getObj2() {
        return obj2;
    }

    public void setObj2(U obj2) {
        this.obj2 = obj2;
    }

    @Override
    public String toString() {
        return "MultiGenBox{" +
                "obj1=" + obj1 +
                ", obj2=" + obj2 +
                '}';
    }

    private T obj1;
    private U obj2;


    public static void main(String[] args) {
        MultiGenBox<Integer, String> multiGenBox = new MultiGenBox<>(15000, "Население нашего района");
        System.out.println(multiGenBox.getObj2()+": "+multiGenBox.obj1);
    }
}
