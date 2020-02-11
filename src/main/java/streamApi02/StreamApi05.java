package streamApi02;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamApi05 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Susi", null, "", "Andrey");
        List<String> names1 = Arrays.asList("Anna", "Susi", "", "Andrey");

        List<Integer> count1 = names1
                .stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(count1);

        for (String name : names) {
            if (name != null && !name.isEmpty() && !name.contains("a")) {
                System.out.println(name);
            }
        }

        System.out.println();

        names
                .stream()
                .filter(Objects::nonNull)
                .filter(n -> !n.isEmpty() && !n.contains("a"))
                .forEach(System.out::println);


    }
}
