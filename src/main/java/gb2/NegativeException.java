package gb2;

public class NegativeException extends ArithmeticException{
    public NegativeException() {
        super("Одна из сторон отрицательная или нулевая");
    }
}
