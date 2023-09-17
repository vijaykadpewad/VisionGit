package Thread;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;

public class Demo implements Runnable {

    @Override
    public synchronized void run() {
        for(int i=1;i<5;i++){
            System.out.println(":index:"+i+"thread:"+Thread.currentThread().getName());
        }

    }
    public static void main(String[] args) {
        Demo ref=new Demo();
        Thread ref1=new Thread(ref);
        Thread ref2=new Thread(ref);
        ref1.setName("vijay");
        ref1.start();
        ref2.setName("shubham");
        ref2.start();

    }
}
