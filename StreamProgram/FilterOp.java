package StreamProgram;

import java.util.ArrayList;
import java.util.List;

public class FilterOp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Vijay");

        names.add("Sourav");

        names.add("Angad");

        names.add("Angad");

        names.add("vijay");

        names.add("Vijay");

        names.add("Shubham");

//Selecting only unique names

        names.stream().distinct().forEach(System.out::println);
    }
}
