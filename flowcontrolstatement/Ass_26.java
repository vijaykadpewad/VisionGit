package flowcontrolstatement;

import java.util.Scanner;

//26. A company insures its drivers in the following cases:
//
//        If the driver is married
//        If the driver is unmarried, male & above 30 years of age
//        If the driver is unmarried, female & above 25 years of age
public class Ass_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marital status married or unmarried--");
        String status = sc.next();

        if (status.equals("married")) {
            System.out.println("A company insures its drivers");
        }
        else {
        System.out.println("Enter gender male or female--");}
         String gender = sc.next();
        System.out.println("Enter age--");
         int age = sc.nextInt();
         if (status.equals("unmarried") && gender.equals("male") && age > 30) {
            System.out.println("A company insures its drivers unmarried ,male,above 30 age");
        } else if (status.equals("unmarried") && gender.equals("female") && age > 25) {
            System.out.println("A company insures its drivers unmarried ,female ,above 25 years of age");
        } else {
            System.out.println("A company is not insures its drivers");
        }
    }
}


