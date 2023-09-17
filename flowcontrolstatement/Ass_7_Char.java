package flowcontrolstatement;

import java.util.Scanner;

//7. Write a program to check whether a character is alphabet or not
public class Ass_7_Char {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value");
        char a=sc.next().charAt(0);
        if(a>='a' && a<='z' || a>='A' && a<='Z')
        {
            System.out.println("This is a character");
        }
        else {
            System.out.println("this is not character");
        }
    }
}
