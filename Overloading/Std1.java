package Overloading;

public class Std1 {
    Std1 show(){
        Std1 tt =new Std1();
        System.out.println("std1 method");
        return tt;
    }
}
class Std2{
    Std2 show(){
    Std2 ff=new Std2();
        System.out.println("class std2");
    return ff;
    }

    public static void main(String[] args) {
        Std2 ii=new Std2();
        ii.show();
    }
}