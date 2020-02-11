package streamApi01;

import javax.lang.model.element.Element;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndCount {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("b1", "b2", "b3", "b2");
        Collection<People> peoples = Arrays.asList(
                new People("Nick", 19, Sex.MAN),
                new People("Tom", 23, Sex.MAN),
                new People("Doc", 16, Sex.MAN),
                new People("Nickolaush", 28, Sex.MAN),
                new People("Nickolas", 19, Sex.MAN)
        );
        Collection<Integer> integers = Arrays.asList(1, 3, 5, 8, 2, 4);
        System.out.println(integers);
        integers
                .stream()
                .sorted(Comparator.comparing(Integer::intValue))
                .forEach(e -> System.out.print(e + ", "));
        System.out.println();

        integers
                .stream()
                .filter(e -> e >= 3)
                .sorted(Comparator.comparing(Integer::intValue))
                .forEach(e -> System.out.print(e + ", "));
        System.out.println();

        long count = collection
                .stream()
                .filter("b3"::equals)
                .count();
        System.out.println(count);

        List<String> peopleList = peoples
                .stream()
                .map((s) -> s + "\n")
                .collect(Collectors.toList());
        System.out.println(peopleList);
    }
}
