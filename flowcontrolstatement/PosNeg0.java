package flowcontrolstatement;

import java.util.Scanner;

//3. Write a program to check whether a number is negative, positive or zero
public class PosNeg0 {
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:-");
        int a= sc.nextInt();*/
        int a =6;
        if (a>0){
            System.out.println(+a+" "+"is positive number");
        }
        else if (a<0){
            System.out.println(+a+" "+"is a negative Number");
        }
        else
            System.out.println(+a+" "+"is a Zero");
    }
}
