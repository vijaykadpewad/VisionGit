package Abstraction;

abstract class area {
    abstract void circle();
     static  int a=10;
    area(){

    }



    public static void main(String[] args) {
        System.out.println(a);
    }
}
abstract class radius extends area{
    abstract void cir1();

    @Override
    void circle() {
        int a=12,res;
        res= (int) (3.14*a*a);
        System.out.println("Area of circle:" +"    " +res);

    }
}
class res2 extends radius{
    @Override
    void cir1() {
        int a=10,b=20;
        int c;
        c=a*b;
        System.out.println("Multiplication"+c);
    }

    public static void main(String[] args) {
        res2 p=new res2();
        {
            p.cir1();
            p.circle();
        }
    }
}