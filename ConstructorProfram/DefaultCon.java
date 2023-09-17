package ConstructorProfram;
class Virat{
    Virat(){
        System.out.println("Virat class has default con");
    }
    Virat(int v){
        System.out.println("Virat class has para con");
    }
}
class Rohit extends Virat{
    Rohit(){
        System.out.println("Rohit class has default con");
    }
    Rohit(String rohit){
        System.out.println("Rohit class has string para con");
    }

}
class Anushka extends Rohit{
    Anushka(){
        System.out.println("Anushka class has default para con");
    }
    Anushka(Double i){
        System.out.println("Anushka class has Double para con");
    }
}
public class DefaultCon extends Anushka {
    public static void main(String[] args) {
        DefaultCon dc= new DefaultCon();
    }
}
