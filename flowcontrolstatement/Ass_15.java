package flowcontrolstatement;

//15. Write a program to input all sides of a triangle and check whether triangle is valid or not
public class Ass_15 {
    public static void main(String[] args) {


    int a=12;
    int b=16 ;
    int c=14;
    if(a+b>c && b+c>a &&c+a>b){
        System.out.println("triangle is valid");

    }
    else{
        System.out.println("Triangle is not valid");
    }
}
}