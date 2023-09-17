package flowcontrolstatement;

import java.util.Scanner;

//. Write a program to calculate the salary as per the following table
//
//Gender Year of Service Qualifications Salary
//Male >= 10 Post - Graduate 15000
//>= 10 Graduate 10000
//< 10 Post - Graduate 10000
//< 10 Graduate 7000
//Female >= 10 Post - Graduate 12000
//>= 10 Graduate 9000
//< 10 Post - Graduate 10000
//< 10 Graduate 6000
public class Ass_27 {
    public static void main(String[] args) {
            String gender = "Female";
            int yearOfService = 10;
            String qualifications = "Post-Graduate";
            int salary = 0;

            if (gender==("Male")) {
                if (yearOfService >= 10) {
                    if (qualifications.equals("Post-Graduate")) {
                        salary = 15000;
                    } else if (qualifications.equals("Graduate")) {
                        salary = 10000;
                    }
                } else if (yearOfService < 10) {
                    if (qualifications.equals("Post-Graduate")) {
                        salary = 10000;
                    } else if (qualifications.equals("Graduate")) {
                        salary = 7000;
                    }
                }
            } else if (gender.equals("Female")) {
                if (yearOfService >= 10) {
                    if (qualifications.equals("Post-Graduate")) {
                        salary = 12000;
                    } else if (qualifications.equals("Graduate")) {
                        salary = 9000;
                    }
                } else if (yearOfService < 10) {
                    if (qualifications.equals("Post-Graduate")) {
                        salary = 10000;
                    } else if (qualifications.equals("Graduate")) {
                        salary = 6000;
                    }
                }
            }

            System.out.println("Salary: " + salary);
        }
        }