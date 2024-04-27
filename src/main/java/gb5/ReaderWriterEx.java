package gb5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class ReaderWriterEx {
    public static void main(String[] args) {
        try (OutputStream outputStream1 = new FileOutputStream("hello.txt")) {
            outputStream1.write("Hello world".getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (InputStreamReader in = new InputStreamReader(new FileInputStream("hello.txt"), StandardCharsets.UTF_8)) {
            int charCode;
            while ((charCode = in.read()) != -1) {
                System.out.println((char) charCode);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("hello.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ArrayList<Student> arrayList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                arrayList.add(new Student(Integer.parseInt(line.split(";")[0]
                ), line.split(";")[1], line.split(";")[2]));
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(arrayList);

        try (PrintWriter printWriter = new PrintWriter("new_students.txt")){
            for (Student student: arrayList){
                printWriter.println(student.getStudent()+";"+student.getName()+";"+student.getEmail());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}