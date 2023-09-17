package flowcontrolstatement;

import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for math subject");
        int a = sc.nextInt();
        System.out.println("Enter marks for science subject");
        int b = sc.nextInt();
        System.out.println("Enter marks for history subject");
        int c = sc.nextInt();
        System.out.println("Enter marks for marathi subject");
        int d = sc.nextInt();
        System.out.println("Enter marks for hindi subject");
        int e = sc.nextInt();


        int x = (a + b + c + d + e) / 5;
        if (x > 60) {
            System.out.println("First Division");
        } else if (x > 50 && x < 59) {

            System.out.println("Second Division");
        } else if (x > 40 && x < 49) {
            System.out.println("Third Division");
        } else {
            System.out.println("Failed");
        }

    }
}
