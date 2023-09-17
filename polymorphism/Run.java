package polymorphism;

public class Run {
    public static void main(String[] args) {
        Run rn=new Run();
       Run run =new Run(9);
        //walk cc=new walk();
    //this(88);
    }
    Run(){

//this(7);
        System.out.println("this is con");
    }
   Run(int f) {
        //this();
        System.out.println("this is con with one para");
    }
    void run(int g){
        System.out.println("this method has int para");
    }
    void run(){
        System.out.println("this method has no para");

    }
    void run(int f, int j){
        System.out.println("this method has int, int para");

    }
    void run (int h, double f){
        System.out.println("this method has int, double para");
    }
}
/*class walk extends Run
{
    walk()
    {
       // super(123);
        System.out.println("enter a method ");
    }
}*/
