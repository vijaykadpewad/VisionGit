package StreamProgram;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("vijay");
        names.add("kadpewad");
        names.add("parth");
        names.add("vijaykad");
        names.add("parthmm");
        names.stream().map(String::length).forEach(System.out::println);
    }
}
