package gb2;

import gb1.CanSwim;
import gb1.Pool;

import java.util.Arrays;
import java.util.Scanner;

public class Dz2 {
    public static void main(String[] args)  {
        /*
    1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
    подаче массива другого размера необходимо бросить исключение MyArraySizeException.*/

        int row;
        int column;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        column = sc.nextInt();

        String[][] name = new String[row][column];

        arrayStrErr(row, column);
        //arrayErr();
    }





/*
   2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и
    просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
            ячейке лежит символ или текст вместо числа), должно быть брошено исключение
    MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.





    3 В методе main() вызвать полученный метод, обработать возможные исключения
    MyArraySizeException и MyArrayDataException и вывести результат расчета.

     */

    public static void arrayStrErr(int row, int column) throws MyArrayDataException {
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        column = sc.nextInt();
        String[][] name = new String[row][column];
        try {
//            for (int i = 0; i < name.length; i++) {
//                for (int j = 1; j < name.length; j++) {
//                    System.out.print(i+j);
//                    System.out.print("");
//                }
//                System.out.print("");
//            }
            if (row != 4 || column != 4) throw new MyArraySizeException(row, column);
            System.out.println("Create Array ");
            for (int i = 0; i < name.length; i++) {
                for (int j = 0; j < name[i].length; j++) {
                    System.out.println("New row " + i + " column " + j);
                    name[i][j] = sc.next();
                }
            }
        }catch(MyArrayDataException exception) {
                    exception.getMessage();
            System.out.println("Вы допустили ошибку внутри массива");


        }
    }


    public static void arrayErr() throws MyArraySizeException {
        String[][] names = {new String[]{"Lena", "Uliya"},
                new String[]{"Ruslan", "Dima"},
                new String[]{"Nata", "Tanya"},
                new String[]{"Vova", "Sasha"}
        };
        System.out.println(Arrays.deepToString(names));


    }
}

