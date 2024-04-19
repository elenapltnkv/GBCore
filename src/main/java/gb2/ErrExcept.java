package gb2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ErrExcept {
    public static void main(String[] args) {
        try {
            //test();
            int a = 1;
            int b = 0;
            int c = a / b;
            String[] dfjgd = {"dfghrgehr"};
            String string = dfjgd[1];
            InputStream inputStream = new FileInputStream("fghdfg");
        } catch (StackOverflowError ex) {
            System.out.println("Переполнен стек!");
        } catch (ArithmeticException ef) {
            System.out.println("Мы попытались делить на 0");
        } catch (IndexOutOfBoundsException ix) {
            System.out.println("Нет такого элемента в массиве");
        }catch (FileNotFoundException f){
            f.getStackTrace();
            System.out.println("Нет такого файла");
        }finally {
            System.getLogger("log");
            //System.exit(2);
            System.out.println("Finish");
        }
        System.out.println("I alive!");


    }

    public static void test() {
        test();
    }
}
