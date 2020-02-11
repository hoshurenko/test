package streamApi01;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class Class01 {
    public static void main(String[] args) {
//        classic
        Collection<String> collection = Arrays.asList("first", "last");
        Stream<String> streamFromCollection = collection.stream();
//        from values
        Stream<String> streamFromValues = Stream.of("d1", "hui", "Linux");


    }
}
