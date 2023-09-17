package StreamProgram;

import java.util.*;

public class LimitDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("David");

        names.add("Johnson");

        names.add("Samontika");

        names.add("Brijesh");

        names.add("John");

        names.add("David");

        names.add("Brijesh");

//Selecting first 4 names

        names.stream().limit(4).forEach(System.out::println);

//  Output :

//  David
//  Johnson
//  Samontika
//  Brijesh
    }
}
