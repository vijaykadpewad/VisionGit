package Abstraction;

public class A {


    static int a=10;
    A(int a){
        System.out.println("con "+a);
    }
    static int c=11;
  static   int d=30;
    static {
     d=20;
        a=20;
        //System.out.println("static"+a);
    }
    {
        System.out.println("IIB ");
    }
    public static void main(String[] args) {
        A a=new A(50);
    }
}
