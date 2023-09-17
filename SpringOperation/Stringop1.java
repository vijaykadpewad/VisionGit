package SpringOperation;

class Stringop1 {}
    class Test10{
    int a=5;
    static int b=5;
    public static void main(String[]args) {
        Test10 sd2 = new Test10();
        System.out.println("non static>>"+sd2.a++);
        System.out.println("static>>"+sd2.b++);
        Test10 sd3 = new Test10();
        System.out.println("non static>>"+sd3.a++);
        System.out.println("static>>"+sd3.b++);
        Test10 sd4 = new Test10();
        System.out.println("non static>>"+sd4.a++);
        System.out.println("static>>"+sd4.b++);
        Test10 sd5 = new Test10();
        System.out.println("non static>>"+sd5.a++);
        System.out.println("static>>"+sd5.b++);



    }


}
