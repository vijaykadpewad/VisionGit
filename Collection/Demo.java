package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("vijay");
        list.add("1sourabh");
        list.add("angad");
        list.add("shubham");
        list.add("2akash");
        list.add("shradha");
        list.add("Ketki");
        list.add("3neha");
        list.add("@priya");
        list.add("sneha");
        list.add("akash");
        list.add("kanchan");
      //  Collections.sort(list);
        System.out.println(list);
        ListIterator<String> iterator= list.listIterator();
        while (iterator.hasNext()){
           String s=iterator.next();
            iterator.remove();
           System.out.println(s);
            System.out.println(list);
        }
        System.out.println(list);

   /*     System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("vijay"));
        list.add(5,"vijay");
        System.out.println(list);
        list.remove("angad");
        System.out.println(list);
       // list.clear();
        System.out.println(list.hashCode());
        List list2=new ArrayList<>();
        list2.add("vijay");
        list2.add("sneha");
        List list3=new ArrayList<>();
        list3.add("vijay");
        list3.add("sneha");
        System.out.println(list2.equals(list3));//true
        System.out.println(list2.equals(list));//false

        System.out.println(list.retainAll(list2));
        System.out.println(list);*/
       /* Object obj[]=list.toArray();
        for (Object r:obj) {
            System.out.println(r);

        }*/

/*ist.set(0,"vij");                         //replace
        System.out.println(list);
        list.add(1,"vijay");           //old remove new add

        System.out.println(list);

        System.out.println(list.lastIndexOf("vijay"));//1
        System.out.println(list.lastIndexOf("akash"));//11


        */



    }

}