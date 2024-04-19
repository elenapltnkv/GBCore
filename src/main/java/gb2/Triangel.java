package gb2;

public class Triangel {
    public static void main(String[] args) {
        addTri(-3, 5);
    }

    public static void addTri(int a, int b){
        if (a <= 0 || b <= 0) {

            throw new NegativeException();
        } else {
            System.out.println(a * b);

        }

    }
}
