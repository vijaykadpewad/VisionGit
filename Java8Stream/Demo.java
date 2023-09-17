package Java8Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("vijay");
        names.add("omkar");
        names.add("shubham");
        names.add("shradhha");
        names.add("kanchan");
//Normal Execution
        names.stream().filter((String name) -> name.length() > 5).forEach(System.out::println);
//Parallel Execution
        names.parallelStream().filter((String name) -> name.length() > 5).skip(2).forEach(System.out::println);


//Streams are traversable only once
        List<String> nameList = Arrays.asList("Dinesh", "Ross", "Kagiso", "Steyn");

        Stream<String> stream = nameList.stream();

        stream.forEach(System.out::println);

        stream.forEach(System.out::println);

//Error : stream has already been operated upon or closed
    }}
        class Student {
    String str="vijay";
    String str2="jay";
            public static void main(String[] args) {
                Stream<Students> emptyStream = Stream.empty();

                System.out.println(emptyStream.count());

            }


        }


