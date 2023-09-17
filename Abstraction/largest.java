package Abstraction;

import java.util.Scanner;

abstract class large
{
    abstract void lar();
}
abstract class lar1 extends large
{
    @Override
    void lar() {
//        int a,b;
        Scanner A=new Scanner(System.in);
        System.out.println("Enter the a & b number");
        int a  = A.nextInt();
        int b = A.nextInt();
        if(a>=b)
        {
            System.out.println("A is large" +" "+a);
        }
        else
        {
            System.out.println("B is large" + " "+b);
        }

    }
    abstract void num2();

}
class res0 extends lar1{
    @Override
    void num2() {
        System.out.println("This is the Program Large number who to find out using IF ELSE Statrement");

    }

    public static void main(String[] args) {
        res0 a=new res0();
        a.num2();
        a.lar();
    }
}

