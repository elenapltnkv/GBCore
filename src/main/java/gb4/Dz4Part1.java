package gb4;

import gb4.garage.CarComporatorByValue;

import java.util.*;

public class Dz4Part1 {
    /*Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
    Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
    Посчитать, сколько раз встречается каждое слово.
    */

    public static void main(String[] args) {
        ArrayList<String> dictionaryList = new ArrayList<>();
        dictionaryList.add("Tuya");
        dictionaryList.add("Sosna");
        dictionaryList.add("Bereza");
        dictionaryList.add("Dub");
        dictionaryList.add("El");
        dictionaryList.add("Dub");
        dictionaryList.add("Ryabina");
        dictionaryList.add("Klen");
        dictionaryList.add("Klen");

        System.out.println(dictionaryList);

        LinkedHashSet<String> addNewDictionary = new LinkedHashSet<>(dictionaryList);
        System.out.println(addNewDictionary);
        int dc = (int) dictionaryList.stream().distinct().count();
        int dc1 = (int) dictionaryList.stream().count();
        System.out.println("Колличество уникальных слов: " + dc);
        System.out.println("Колличество повторяющихся слов: "+ (dc1-dc));

    }




}
