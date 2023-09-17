package package1;

import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number for addition");
     int a= sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Addition of two number is"+c);
    }
}