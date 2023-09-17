package Abstraction;

abstract class rectangle{
    abstract int getArea();
}
abstract class length extends rectangle{
    abstract int  length ();

    @Override
    int getArea() {
        System.out.println("Formula of rectangle ");
        System.out.println("A=W*l");
        return 0;
    }
}
class result3 extends length{
    @Override
    int length() {
        int A=19,B=20;
        int c=A*B;
        System.out.println("area of the rectangle is"+" "+c);
        return 0;
    }

    public static void main(String[] args) {
        result3 rs=new result3();
       rs.getArea();
       rs.length();

    }
}