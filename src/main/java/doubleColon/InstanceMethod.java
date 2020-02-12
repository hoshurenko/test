package doubleColon;

import java.util.ArrayList;
import java.util.List;

public class InstanceMethod {
    static class Test {
        String s = null;

        Test(String s) {
            this.s = s;
        }

        void someFunction() {
            System.out.println(this.s);
        }
    }

    public static void main(String[] args) {
        List<Test> list = new ArrayList<>();
        list.add(new Test("Sd0"));
        list.add(new Test("Sd1"));
        list.add(new Test("Sd2"));
        list.add(new Test("Sd3"));

//        call the instance method using double colon operator
        list.forEach(Test::someFunction);
    }
}
