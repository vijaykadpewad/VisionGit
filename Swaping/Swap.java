package Swaping;

public class Swap {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        if (a > b) {
b=a;
a=b-(b/2);
            System.out.println("after swap a is--"+a+" "+"after wap b is--"+b);
        }
        else {
            a=b;
            b=a-(a/2);
            System.out.println("after swap a is--"+a+" "+"after wap b is--"+b);
        }
    }
}
