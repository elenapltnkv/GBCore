package gb2;

import java.util.Arrays;
import java.util.Scanner;

public class Dz2 {
    public static void main(String[] args) {
        /*
    1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
    подаче массива другого размера необходимо бросить исключение MyArraySizeException.*/

        int row;
        int column;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        column= sc.nextInt();

        String [][] name = new String[row][column];



        arrayErr();
    }





/*
   2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и
    просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
            ячейке лежит символ или текст вместо числа), должно быть брошено исключение
    MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.





    3 В методе main() вызвать полученный метод, обработать возможные исключения
    MyArraySizeException и MyArrayDataException и вывести результат расчета.

     */
    public static void arrayErr() throws MyArraySizeException {
        String[][] names = {new String[]{"Lena", "Uliya"},
                new String[]{"Ruslan", "Dima"},
                new String[]{"Nata", "Tanya"},
                new String[]{"Vova", "Sasha"}
        };
        System.out.println(Arrays.deepToString(names));


    }
}
