package next;

import java.util.ArrayList;
import java.util.List;

public class Woy {
    public static List<String> list = new ArrayList<String>();

    public static void main(String[] args) {
        list.add("The first element ever");
        list.add("Second one");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
