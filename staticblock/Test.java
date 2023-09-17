package staticblock;

public class Test {

    static {
        System.out.println("this statement is in static block");
    }
    Test(){
        System.out.println("this statement is in constructor");
    }
    static void show(){
        System.out.println("this statement is in static method");
    }
    {
        System.out.println("this statement is in instance block");
    }

    public static void main(String[] args) {
        System.out.println("this statement is in main method block");

        Test ts=new Test();
        show();
    }
}



