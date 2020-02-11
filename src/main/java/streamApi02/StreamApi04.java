package streamApi02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamApi04 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 4, 6, 34, 22, 65, 5);
        integerList
                .stream()
                .filter(s -> s < 10)
                .sorted()
                .forEach(s -> System.out.print(s + ", "));
        System.out.println();

        integerList
                .stream()
                .filter(t -> t > 10)
                .sorted()
                .forEach(System.out::println);

    }
}
