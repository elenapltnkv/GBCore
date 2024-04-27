package gb5;

import java.io.File;
import java.io.IOException;

public class FileExamp {
    public static void main(String[] args) throws IOException {
        File file = new File("1.txt");
        System.out.println(file.exists());
        File file1 = new File("2.txt");
        file1.createNewFile();
        System.out.println(file1.isAbsolute());
        //file1.deleteOnExit();

        System.out.println(file1.length());

        File filePath = new File("1");
        System.out.println(filePath.isDirectory());
        filePath.mkdir();

        File filePath1 = new File("5/6/7");
        filePath1.mkdirs();

        System.out.println(filePath.length());

        for (File fileTemp: filePath.listFiles()){
            System.out.println("Имя файла: "+ fileTemp.getName() + " размер файла: "+ fileTemp.length());
        }
    }

}
