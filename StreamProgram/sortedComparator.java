package StreamProgram;

import java.util.*;
import java.util.function.Predicate;

public class sortedComparator {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> names09 = new LinkedList<>();

        names.add("David");

        names.add("Johnson");

        names.add("Samontika");

        names.add("Brijesh");

        names.add("John");

//Sorting the names according to their length

        names.stream().sorted((String name1, String name2) -> name1.length() - name2.length()).forEach(System.out::println);
//        names.stream().filter(a->a.compareTo(names.contains("David"));

//  Output :

//  John
//  David
//  Johnson
//  Brijesh
//  Samontika
    }}