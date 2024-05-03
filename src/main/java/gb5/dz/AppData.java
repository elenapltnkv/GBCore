package gb5.dz;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class AppData {
    private String[] header;
    private Integer[][] data;

    public AppData() {
        header = new String[]{"Value 1", "Value 2", "Value 3"};
        data = new Integer[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    }

    public void saveData(String fileName) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            bufferedWriter.write(rowToString(header));
            for (Integer[] array : data) {
                bufferedWriter.write(rowToString(array));
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
public  void readData(String fileName){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            header= bufferedReader.readLine().split(";");
            String line;
            ArrayList<Integer[]> arrayList = new ArrayList<>();
            while ((line = bufferedReader.readLine())!=null){
                arrayList.add(stringToIntArray(line));

            }
            data = arrayList.toArray(new Integer[][]{});
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
}
    private <T> String rowToString(T[] row) {
        String result = "";
        for (int i = 0; i < row.length; i++) {
            if (i < row.length - 1) {
                result = result + row[i] + ";";
            } else {
                result = result + row[i];
            }
        }
        result += "/n";
        return result;
    }

    private Integer[] stringToIntArray(String str){
        String[] stringArray = str.split(";");
        Integer[] intArray = new Integer[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i]= Integer.parseInt(stringArray[i]);
        }

        return intArray;
    }

    public static void main(String[] args) {
        AppData appData = new AppData();
        //appData.saveData("test.csv");
        appData.readData("test.csv");
        System.out.println(Arrays.toString(appData.header));
        //System.out.println(Arrays.deepToString(appData.data));
    }
}
