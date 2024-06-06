package gb9;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SteamCreationEx {
    public static void main(String[] args) {
        IntStream.range(1, 10)
                .forEach(p -> System.out.print(p));

        System.out.println(Stream.iterate(5, x -> x + 5)
                .limit(10)
                .collect(Collectors.toList()));

    }
}
