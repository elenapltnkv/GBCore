package gb4;

import java.util.Comparator;

public class CatByNameLenthComporator implements Comparator<Cat> {
    @Override
    public int compare(Cat c1, Cat c2) {
        return c1.getName().length()-c2.getName().length();
    }
}
