package HIEARACHICAL;

import java.sql.SQLOutput;

public class god {
}
class mahesh{
    void getName(){
        System.out.println("this method is in mahesh class");
    }
}
class ganesh extends mahesh{
    void getName1(){
        System.out.println("this method is in ganesh class");
    }
}
class kartik extends mahesh{
    void getName2(){
        System.out.println("this method is in kartik class");

    }

    public static void main(String[] args) {
        ganesh gn=new ganesh();
        gn.getName1();
        gn.getName();
        kartik kr=new kartik();
        kr.getName();
        kr.getName2();
    }
}

