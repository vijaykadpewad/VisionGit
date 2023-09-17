package flowcontrolstatement;

import java.util.Scanner;

//5. Write a program to check whether a number is even or odd
public class Ass_5_evenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println(+a+"- is a even number");
        }
        else
            System.out.println(+a+"- is a odd number");
    }
}
