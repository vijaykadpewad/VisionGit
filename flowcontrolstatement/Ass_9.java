package flowcontrolstatement;

import java.util.Scanner;

//9. Write a program to input any character and check whether it is alphabet, digit or special character
public class Ass_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character");
        char a = sc.next().charAt(0);
        if (a >= 'a' && a <= 'z' || a >= 'A' && a <= 'Z') {

            System.out.println(a + "-this is a alphabet");
        } else if (a >= '0' && a <= '9') {
            System.out.println(a + "-this is a digit");
        } else {
            System.out.println(a + "this is a special charcter");
        }
    }

}