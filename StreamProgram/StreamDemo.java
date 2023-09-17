package StreamProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[]args){
       /* List<Integer> list1=new ArrayList<Integer>() ;
        list1.add(22);
        list1.add(67);
        list1.add(90);
        list1.add(55);
        list1.add(24);



       List<Integer> list2=list1.stream().filter(i ->i>50 ).collect(Collectors.toList());
        System.out.println(list2);*/
        List<String> list3=new ArrayList<String>() ;
        list3.add("vijay");
        list3.add("sourav");
        list3.add("shubham");
        list3.add("angad");
        list3.add("vijay");
      if(list3.stream().allMatch(e->e.length()>5)); {
          System.out.println("true");
      }

    }
}
