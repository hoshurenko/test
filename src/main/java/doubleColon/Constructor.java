package doubleColon;

import java.util.ArrayList;
import java.util.List;

public class Constructor {

    //    Class Constructor
    public Constructor(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("An");
        list.add("Scott");
        list.add("Anafema");
        list.add("Bill");

        System.out.println(list);

        list
                .stream()
                .sorted()
                .forEach(Constructor::new);

    }
}
