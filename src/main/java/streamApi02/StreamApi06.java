package streamApi02;

import java.util.Arrays;
import java.util.List;

public class StreamApi06 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 1, 5, 4, 3);
        Integer sum = numbers
                .stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        int product = numbers
                .stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println(product);

        int maxValue = numbers
                .stream()
                .reduce(1, Integer::max);
        System.out.println(maxValue);
    }
}
