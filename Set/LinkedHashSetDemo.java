package Set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet=new LinkedHashSet();
        linkedHashSet.add("ram");
        linkedHashSet.add("shyam");
        linkedHashSet.add(null);
        linkedHashSet.add(10);
        linkedHashSet.add("ram");

        System.out.println(linkedHashSet);
    }
}
//output-->[ram, shyam, null, 10]