package ArraylListPack;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

    public class CollectionIntroduction {

        public static void main(String[] args) {

            List<String> list = new ArrayList<>();
            list.add("Apple");
            list.add("banana");
            list.add("Cheerry");
            list.add("Date");
           /* list.add("NZX");
            list.add("ABC");
            list.add("UYU");
            list.add("ABC");
            list.add("123");*/



            ListIterator<String >iterator= list.listIterator();
             int count =0;
             while(iterator.hasNext()&& count <2){
                 System.out.println(iterator.next()+" ");
                 count++;



             }
             while (iterator.hasNext()){
                 System.out.println(iterator.previous()+" ");
             }

    /*        //for loop
        *//*for(int i=3; i < list.size() -3; i++){

        }*//*

            //foreach
            for (String s23:list) {
                // list.add("Java");
                //System.out.println(s23.concat("Test"));
            }

            //System.out.println(list);

            ListIterator<String> iterator = list.listIterator();
            while(iterator.hasNext()){
                if(iterator.hasPrevious()){
                    System.out.println("It has previous element which is "+iterator.next());
                }
                iterator.add("Java added");
                System.out.println("Using List Iterator "+iterator.next());
            }

            Iterator<String> iterator1 = list.iterator();
            while (iterator1.hasNext()){

            }

            // int a = 123;


*/

        }
    }

