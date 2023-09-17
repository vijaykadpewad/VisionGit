package flowcontrolstatement;

import java.util.Scanner;

//8. Write a program to input any alphabet and check whether it is vowel or consonant
public class Ass_8_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any alphabet");
        char j=sc.next().charAt(0);
        if(j=='a'|| j=='e'||j=='i'||j=='0'||j=='u'){
            System.out.println("This is a vomel");
        }
        else {
            System.out.println("this is a consonent");
        }
    }
}
