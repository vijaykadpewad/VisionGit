package staticblock;

import customexception.InsufficientFundException;

import java.io.FileReader;

public class Static11 {
    /*
    static int a;
    static void get() {

        System.out.println("vijay");
    }
    static{
        System.out.println("static block");

    }
//    void add()
//    {
//        static int a=10;
//        static int a=20;
//    }

    public static void main(String[] args) {


        Static11 st = new Static11();
        st.get();
    }*/

}


class A {
    static {
        int a = 10;
        int b = 10;
        int c=0;
        try {
           // FileReader file=new FileReader("text.txt");
            System.out.println(a / c);
        } catch (Exception e) {
            if (a/b==1){
            throw new InsufficientFundException("vijay");}
           // System.out.println(e.getMessage());
else{
                System.out.println("a/b!=1");
            }
        }
    }

    A() {
        //System.out.println("java");
    }

    static Object see() {
        return new A();
    }

    public static void main(String[] args) {
        see();
    }
}