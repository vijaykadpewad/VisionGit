package Abstraction;

import java.util.Scanner;

abstract class swap
{
    abstract void swap1();

}
abstract class number1 extends swap{

    @Override
    void swap1() {
        Scanner A=new Scanner(System.in);
        System.out.println("Enter the a & b  number");
        int a  = A.nextInt();
        int b = A.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("swapping A "+" "+a);
        System.out.println("swapping B "+" "+b);
    }
    abstract void swap2();
}
class res10 extends number1{
    @Override
    void swap2() {
        System.out.println("This program is 2 number is swapping without using 3rd variable");
    }

    public static void main(String[] args) {
        res10 e= new res10();
        e.swap2();
        e.swap1();
    }
}