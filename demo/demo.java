package demo;
class A1{
    void get(){
        System.out.println("class A method");
    }
}
class c{

}
class B1 extends  A1{
    void get(){
        System.out.println("Class B method");
    }


    public static void main(String[] args) {


        A1 a =new A1();
        B1 b =new B1();
        a=b;
     //   b=a;
        b.get();
    }
    }
public class demo {
}
