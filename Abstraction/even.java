package Abstraction;

import java.util.Scanner;

abstract class number {
    abstract void even();

}

abstract class no extends number {
    void even() {
//        int a;
        Scanner A = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = A.nextInt();
        if (a % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is odd");
        }
    }

    abstract void odd();
}

class number3 extends no {
    @Override
    void odd() {
        System.out.println("This is the Even Odd Program");
    }

    public static void main(String[] args) {
        number3 n = new number3();
        n.odd();
        n.even();
    }
}
