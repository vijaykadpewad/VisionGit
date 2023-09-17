package StreamProgram;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Test {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("ABCD");
            list.add("BCD");
            list.add("22ABCD");
            list.add("ABCDDD");
            list.add("5ABCD");
            list.add("BVABCD");
            list.add("LOKABCD");
            list.add("ABCD7678");
            list.add("ABGGGCD");
            list.add("BBBABCD");
            list.add("LLLABCD");
            //print all records which starts with char A
        /*for (String element: list ) {
            if(element.startsWith("A")){
                System.out.println("Print all records which starts with Char A "+element);
            }
        }*/

            List<String> outputList = list.stream().
                    filter(s -> s.startsWith("A")).
                    distinct().
                    sorted().
                    filter(s -> s.startsWith("B")).
                    collect(Collectors.toList());

            list.stream().sorted().forEach(System.out::println);



            System.out.println("Print all records which starts with Char A "+outputList);

            System.out.println("Print ori list "+list);


        }
    }

