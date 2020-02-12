package doubleColon;

import java.util.Arrays;
import java.util.List;

public class InstanceMethod02 {
    void someFunction(String s) {
        System.out.print(s + "\n");
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("s", "df", "kuku");
        list.forEach((new InstanceMethod02()::someFunction));
        System.out.println("Bye");
    }
}
