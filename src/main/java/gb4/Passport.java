package gb4;

import java.util.Arrays;
import java.util.Random;

public class Passport {
    public static void main(String[] args) {
        Integer [] passport = new Integer[50];
        Random random = new Random();
        for (int i = 0; i < passport.length; i++) {
            passport[i] = random.nextInt(9999)+100000;

        }

        Integer[] newPassport =new Integer[51];
        System.arraycopy(passport, 0, newPassport,0, passport.length);
        newPassport[50] = 123123;
        System.out.println(Arrays.toString(passport));
        System.out.println(Arrays.toString(newPassport));
    }


}
