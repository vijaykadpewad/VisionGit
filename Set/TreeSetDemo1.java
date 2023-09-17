package Set;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet();
        treeSet.add("vijay");
        treeSet.add("pune");
        treeSet.add("Rahul");

       // treeSet.add(30);  runtime get error(ClassCast Exception)
      //  treeSet.add();    treeSet heterogeneous object is not allowed
        // treeSet.add(null); run time will get(NullPointerException)
        System.out.println("first set ="+ treeSet);


        TreeSet treeSet1=new TreeSet();
        treeSet1.add(50);
        treeSet1.add(10);
        treeSet1.add(100);
        System.out.println("Second set ="+treeSet1);



    }
}
