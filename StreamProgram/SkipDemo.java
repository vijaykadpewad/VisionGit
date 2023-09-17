package StreamProgram;

import java.util.ArrayList;
import java.util.List;

public class SkipDemo {
    public static void main(String[] args) {
        List<String> names =new ArrayList<>();
        names.add("vijay");
        names.add("parth");
        names.add("Maroti");
        names.add("Rohan");
        names.add("Soham");
        names.add("Vijay");
        names.add("Soham");
        names.stream().skip(4).forEach(System.out::println);
    }
}
