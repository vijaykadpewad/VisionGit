package flowcontrolstatement;

import java.util.Scanner;

//11. Write a program to input week number and print week day
public class Ass_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter week number");

int week= sc.nextInt();

    switch (week){
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
    }
    }
}
