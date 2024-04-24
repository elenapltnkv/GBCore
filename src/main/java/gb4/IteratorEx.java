package gb4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()){
            Integer element = iterator.next();
            if(element==5){
                iterator.remove();
            }
        }
        System.out.println(arrayList);
    }
}
