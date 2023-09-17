package staticblock;

public class Static12 {
    static int a=10;


static {
        System.out.println("this statement is in static block");//static bloock
        }
        Static12(){
        System.out.println("this statement is in constructor");
        }//con
   void show(){
        System.out.println("this statement is in show method");//method
        }

    {
        System.out.println("this statement is in instance block");//iib
    }
}
class sta extends Static12{


   static {
        System.out.println("child static block");
    }
    sta(){
        System.out.println("Con1");
    }
    {
        System.out.println("instence 3");
    }

    public static void main(String[] args) {
     //  static int a=30;

        System.out.println("main method");
        sta s=new sta();
 }
}
