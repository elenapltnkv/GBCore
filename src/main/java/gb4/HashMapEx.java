package gb4;

import java.util.*;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, List<String>> countriesMap = new HashMap<String, List<String>>();
        countriesMap.put("Russ",new ArrayList<>(Arrays.asList("Moscow", "Kazan", "Smolensk")));
        countriesMap.put("Kaz",new ArrayList<>(Arrays.asList("Astana", "Almata", "Semei")));
        System.out.println(countriesMap);

//        for (String key: countriesMap.keySet()){
//            System.out.println(countriesMap.get(key));
//        }
//
//        Collection<List<String>> towns =  countriesMap.values();
//        System.out.println(towns);

        Iterator<Map.Entry<String, List<String>>> entryIterator= countriesMap.entrySet().iterator();
        while (entryIterator.hasNext()){
            String country =entryIterator.next().getKey();
            System.out.println(country);

        }
    }
}
