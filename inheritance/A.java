package inheritance;


public class A {

  void see(){
       System.out.println("java");
   }


}
class B extends  A{

   void see(){
    System.out.println("programming");
}
void saw() {
    System.out.println("language");
}

    public static void main(String[] args) {

A a =new A();
a.see();
        A b=new B();
        b.see();
     //   b.saw();
       // b.saw();
}

}
