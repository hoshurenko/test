package streamApi02;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi02 {
    public static void main(String[] args) {
        Collection<String> collection1 = Arrays.asList("a1", "a2", "a3", "a4", "a5");
        Collection<String> collection2 = Arrays.asList("1,2,3", "1,2");

        List<String> list = collection1
                .stream()
                .map((s) -> s + "_1")
                .collect(Collectors.toList());
        System.out.println(list);

        int[] ints = collection1
                .stream()
                .mapToInt((s -> Integer.parseInt(s.substring(1))))
                .toArray();
        System.out.println(Arrays.toString(ints));

        String[] strings = collection2
                .stream()
                .flatMap((p) -> Arrays.asList(p.split(","))
                        .stream())
                .toArray(String[]::new);
        System.out.println(Arrays.toString(strings));

        int sum = collection2
                .stream()
                .flatMapToInt((p) -> Arrays.asList(p.split(","))
                        .stream()
                        .mapToInt(Integer::parseInt))
                .sum();
        System.out.println(sum);
    }
}
