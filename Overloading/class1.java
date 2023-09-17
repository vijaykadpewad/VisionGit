package Overloading;

public class class1 {
     class1 getnumber(){
         class1 tt=new class1();
         System.out.println("class1 method");
         return tt;
     }
}
class class2 extends class1{
    class2 getnumber(){
        System.out.println("hiiii");
        class2 ff=new class2();
        System.out.println();
    return ff;
    }

    public static void main(String[] args) {
        class2 kk=new class2();
        kk.getnumber();
    }
}