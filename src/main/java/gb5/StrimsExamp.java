package gb5;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;

public class StrimsExamp {
    public static void main(String[] args) {
        String tempString = "cat";
        System.out.println(Arrays.toString(tempString.getBytes()));
        System.out.println(Charset.defaultCharset());

        File file1= new File("test.txt");
        OutputStream outputStream = null;

        try{
            outputStream = new FileOutputStream(file1);
            outputStream.write("кот идиот".getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try(OutputStream outputStream1  = new FileOutputStream(file1)) {
            outputStream1.write("Grom".getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        long currentTime = System.currentTimeMillis();
        try(OutputStream outputStream1 =new FileOutputStream("bufferfile.txt")) {
            for (int i = 0; i < 5*1024*1024; i++) {
                outputStream1.write(65);
                
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Время без буффера: "+ (System.currentTimeMillis()-currentTime));

     currentTime = System.currentTimeMillis();
        try(OutputStream outputStream1 = new BufferedOutputStream(new FileOutputStream("bufferfile.txt"))) {
        for (int i = 0; i < 5*1024*1024; i++) {
            outputStream1.write(65);

        }
        outputStream1.flush();
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
        System.out.println("Время с буфферизацией: "+ (System.currentTimeMillis()-currentTime));
}
}
