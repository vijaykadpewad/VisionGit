package flowcontrolstatement;

import java.util.Scanner;

//2. Write a program to find maximum between three numbers
public class Max3No {
    public static void main(String[] args) {
//        int a=88;
//        int b=95;
//        int c=77;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if (a>b && a>c){
            System.out.println(+a+"is greater than other two number");
        } else if (b>a && b>c) {
            System.out.println(+b+" is greater than other two number");

        }
        else
        {
            System.out.println(+c+ ""+" is greater than other two number");
        }
    }
}
