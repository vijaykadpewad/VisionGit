 package flowcontrolstatement;

//13. Write a program to count total number of notes in given amount
public class Ass_13 {
    public static void main(String[] args) {

        int amount=55887;
        int n500;
        int n100;
        int n10;
        int n1;
        if(amount>=500) {
            n500 = amount / 500;
            amount -= (n500 * 500);
            System.out.println("number of 500 notes--" + n500);
        }
        if(amount>=100) {
            n100 = amount / 100;
            amount -= (n100 * 100);
            System.out.println("number of 100 notes--" + n100);
        }
            if (amount >= 10) {
                n10 = amount / 10;
                amount -= n10 * 10;
                System.out.println("number of 10 notes--" + n10);
            }
             if (amount >= 1) {
            n1 = amount / 1;
            amount -= n1 * 1;
            System.out.println("number of 10 notes--" + n1);

            }


        }}