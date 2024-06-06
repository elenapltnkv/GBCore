package gb9;

import gb9.lambda.Animal;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfacesEx {
    public static void main(String[] args) {
        Predicate<Animal>predicate = new Predicate<Animal>() {
            @Override
            public boolean test(Animal animal) {
                return false;
            }
        };

        Function<String, Integer>strToInt = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };
    }
}
