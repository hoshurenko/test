package next;

import java.util.ArrayList;
import java.util.List;

public class Woy {
    private static List<String> list = new ArrayList<String>();

    public static void main(String[] args) {
        list.add("The first element ever");
        list.add("Second one");
        for (String s : list) {
            System.out.println(s);
        }
        String s1 = list.get(1);
        String s2 = list.get(0);
        System.out.println(s1);
        if (s1.equals(s2)) {
            System.out.println("True");
        } else System.out.println("False");
    }
}
