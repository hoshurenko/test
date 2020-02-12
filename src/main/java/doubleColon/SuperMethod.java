package doubleColon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class SuperMethod {
    static class Test {
        //        super function to be called
        String printString(String s) {
            return ("> " + s + " <" + "\n");
        }
    }

    static class SM extends Test {
        @Override
        String printString(String s) {
            Function<String, String> func = super::printString;

            String newValue = func.apply(s);
            newValue += "Bye " + s + "\n";
            System.out.println(newValue);
            return newValue;
        }

        public static void main(String[] args) {
            List<String> list = Arrays.asList("s", "df", "kuku");

            list.forEach(new SM()::printString);
        }
    }
}
