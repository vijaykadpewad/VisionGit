package flowcontrolstatement;

import java.util.Scanner;

//4. Write a program to check whether a number is divisible by 5 and 11 or not
public class Ass_4_module {
    public static void main(String[] args) {
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
       int a= sc.nextInt();*/
        int a=785;
       if (a%5==0){
           System.out.println(+a+"-Divisible By 5:");
       } else if (a% 11==0) {
           System.out.println(+a+"-Divisible by 11:");

       }
       else
       {
           System.out.println(+a+"-Number is not divisible by 5  & 11");
       }
    }
}
