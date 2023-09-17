package Set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add("jay");
        ts.add("shyam");
        ts.add("ram");
        System.out.println(ts);

        //output-->[jay, ram, shyam]


        TreeSet ts1=new TreeSet();
        ts1.add(10);
        ts1.add(5);
        ts1.add(25);
       // ts1.add("vijay");

        System.out.println(ts1);
//output-->{5,10,25}
    }
}
