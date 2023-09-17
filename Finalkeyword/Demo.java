package Finalkeyword;

public class Demo {
}

/*    static  int a=10;
    static int no=100;
  private   final void run(){

    }
 static  void run(int a){

}
    void show(){
        int no=90;
        System.out.println(no);
    }
    public static void main(String[] args) {
        int a =80000;

        System.out.println(a++);
        System.out.println(Demo.a++);

        Demo dm=new Demo();
        System.out.println(dm.a);
        System.out.println(no);
        System.out.println(Demo.no);


    }
}*/
/*class B{
     static  String v="vijay";
    public static void main(String[] args) {
        String str1 = new String("vijay");
        B a = new B();
     //   System.out.println(str1.hashCode());
        System.out.println(v==str1);
        B b = new B();
        System.out.println(v==str1);
      //  System.out.println(str1.hashCode());

  *//*      String str = new String("vijay");
        System.out.println(v.hashCode());
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(v==str);*//*
    }

}*/
class C {
    static String name = "Java";
    String address = "Pune";

    public static void main(String[] args) {
        C c = new C();
        c.name = "Ketki";
        c.address = "nagpur";

        C d = new C();
        d.name = "angad`";
        d.address = "beed";
        System.out.println(c.name);
        System.out.println(c.address);
        System.out.println(d.name);
        System.out.println(d.address);


    }
}
