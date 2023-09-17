package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("ram");
        hashSet.add("shyam");
        hashSet.add(null);
        hashSet.add(10);
        hashSet.add("ram");
        hashSet.add("vijay");
        System.out.println(hashSet);
        //output--[null, shyam, 10, ram, vijay]
HashSet hashset1 =new HashSet();
hashset1.add(10);
hashset1.add(20);
hashset1.add(30);
for (Object j:hashset1){
    System.out.println(j);
}


    }
}