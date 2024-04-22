package gb2;

import java.util.InputMismatchException;

public class MyArrayDataException extends InputMismatchException {
    int i, j;

    public MyArrayDataException(int i, int j) {
        super("Wrong data. You have: row " + i + ", column " + j);
        this.i = i;
        this.j = j;
    }

    public MyArrayDataException(String s, int i, int j) {
        super(s);
        this.i = i;
        this.j = j;
    }
}
