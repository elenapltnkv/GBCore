package gb5;

import java.io.*;

public class SerializationEx {
    public static void main(String[] args) {
        File file = new File("student5.txt");
        Student student= new Student(2, "Semen", "sem@ya.ru");
        //Student student1= new Student(10, "Silvesrt", "silv@ya.ru");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(student);
            //objectInputStream.writeObject(student1);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            Student student1= (Student) objectInputStream.readObject();
            System.out.println(student1);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
