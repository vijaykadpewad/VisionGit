package flowcontrolstatement;

import java.util.Scanner;

//28. A five-digit number is entered through the keyboard. Write a program to obtain
//the reversed number and to determine whether the original and reversed numbers are equal or not
public class Ass_28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        int num4= sc.nextInt();
        int num5= sc.nextInt();
        System.out.print("reversed number is==");
        System.out.print(num5);
        System.out.print(num4);
        System.out.print(num3);
        System.out.print(num2);
        System.out.println(num1);
        if(num1==num5 && num2==num4 && num3==num3){
            System.out.println("original and reversed number are equal");
        }
        else {
            System.out.println("original and reversed number are not equal");
        }

    }
}
