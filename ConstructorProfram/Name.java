package ConstructorProfram;
class vijay{
    vijay(){
        this(10,77d);
        System.out.println("vijay");
    }
    vijay(int a){
        this("vijay");
        System.out.println("vijay int");
    }
    vijay(int b,double a){
        this(66);
        System.out.println("vijay int, double");
    }
    vijay(String jay){
        System.out.println("vijay sytring");

    }
}
class jay extends vijay{
    jay(){
        System.out.println("jay none");
    }
    jay(String vij){
        this(80,77,99);
        System.out.println("jay String");
    }
    jay(int s){
        this("jay");
        System.out.println("jay int");
    }
    jay(float h,int j){
        this(10);
        System.out.println("jay float, int");
    }
    jay(int h, int i, int j){
        super();
        System.out.println("jay int,int,int");
    }
}
class parth extends jay{
    parth(Double p){
        this(10,"vijay");
        System.out.println(" parth Double");

    }
    parth(){
        this(10);
        System.out.println("path none");

    }
    parth(int a){
        this(33d);
        System.out.println("parth int");

    }
    parth(int b,String par){
        super(60.6f,88);
        System.out.println("parth int,string");
    }
}
public class Name extends parth {
    public static void main(String[] args) {
    Name na=new Name();
}}
