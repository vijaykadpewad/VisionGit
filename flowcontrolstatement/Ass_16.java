package flowcontrolstatement;
//16. Write a program to check whether the triangle is equilateral, isosceles or scalene triangle
public class Ass_16 {
    public static void main(String[] args) {
        int a=12;
        int b=11;
        int c=11;
    if (a==b& b==c){
        System.out.println("Triangle is equilateral ");
    } else if (a==b || b==c|| c==a) {
        System.out.println("Triangle is isosceles");
    }
    else {
        System.out.println("Triangle is scalene");
    }
    }

}
