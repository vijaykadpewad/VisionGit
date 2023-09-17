package Overloading;



public class class3 {
    class1 getnumber(){
        class1 tt=new class1();
        System.out.println("class1 method");
        return tt;
    }
}
class class4 extends class3{
    class2 getnumber(){
        System.out.println("hiiii");
        class2 ff=new class2();
        System.out.println();
        return ff;
    }

    public static void main(String[] args) {
        class4 kk=new class4();
        kk.getnumber();
    }
}