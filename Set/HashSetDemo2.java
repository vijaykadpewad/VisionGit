package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet<String> hashSet= new HashSet<String>();
        hashSet.add("10");
        hashSet.add("20");
        hashSet.add("30");
        hashSet.add(null);
        Iterator<String> itr=hashSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
