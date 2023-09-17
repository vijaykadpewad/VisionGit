package flowcontrolstatement;

import java.util.Scanner;

//6. Write a program to check whether a year is leap year or not
public class Ass_6_leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        //int a=2012;
        int a= sc.nextInt();
        if(a%4==0){
        System.out.println("This is leap year");
    }
    else{
        System.out.println("this is not leap year");
    }
}
}