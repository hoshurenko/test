package doubleColon;

import java.util.ArrayList;
import java.util.List;

public class StaticMethod {
    private static void someFunction(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Geeks");
        list.add("For");
        list.add("GEEKS");

        // call the static method
        // using double colon operator
        list.forEach(StaticMethod::someFunction);
    }
}
