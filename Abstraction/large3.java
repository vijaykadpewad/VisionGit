package Abstraction;

import java.util.Scanner;

abstract class large3
{
    abstract void lar();
}
abstract class lar11 extends large
{
    @Override
    void lar() {
//        int a,b;
        Scanner A=new Scanner(System.in);
        System.out.println("Enter the a & b c number");
        int a  = A.nextInt();
        int b = A.nextInt();
        int c= A.nextInt();
        if(a>=b && b>=c)
        {
            System.out.println("A is large" +" "+a);
        }
        else if (b>=a && b>=c)
        {
            System.out.println("B is large" + " "+b);
        }
        else
        {
            System.out.println("C is large " + " "+c);

        }


    }
    abstract void num22();

}
class res7 extends lar11{
    @Override
    void num22() {
        System.out.println("This is the Program Large number who to find out using IF ELSE Statrement");

    }

    public static void main(String[] args) {
        res7 a=new res7();
        a.num22();
        a.lar();
    }
}


