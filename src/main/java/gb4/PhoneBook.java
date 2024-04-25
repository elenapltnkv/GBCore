package gb4;

import java.util.*;

public class Dz4Part2 {
    /*Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
    В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.

    Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
    тогда при запросе такой фамилии должны выводиться все телефоны.

    Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
    взаимодействие с пользователем через консоль и т.д). Консоль использовать только для вывода результатов проверки телефонного справочника.
    */
    HashMap<String, String> phoneNumberMap1 = new HashMap<>();
//     phoneNumberMap1.put("79916614921", "Ivanov");
//        phoneNumberMap1.put("79916614922", "Petrov");
//        phoneNumberMap1.put("79916614923", "Demidov");
//        phoneNumberMap1.put("79916614924", "Ivanov");
//        phoneNumberMap1.put("79916614925", "Surikov");
//        phoneNumberMap1.put("79916614926", "Petrov");


    public static void main(String[] args) {


    }

    public void addPhones(String phone, String surname) {
        phoneNumberMap1.put(phone, surname);
    }

    public List<String> getPhones(String surname) {
        ArrayList<String> phones = new ArrayList<>();
        for (Map.Entry<String, String> entry : phoneNumberMap1.entrySet()) {
            if (entry.getValue().equals(surname)) {
                phones.add(entry.getKey());
            }
        }
        return phones;
    }


}
