package gb4;

import java.util.HashMap;

public class HashEx {
    public static void main(String[] args) {
        System.out.println("test1".hashCode());
        System.out.println("test1".hashCode());
        HashMap<Integer, String> hp = new HashMap<>();
        hp.put(1,"test");
        hp.put(1,"test1");

        System.out.println(hp);
    }
}
