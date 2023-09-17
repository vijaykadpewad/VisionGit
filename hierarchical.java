import java.util.Hashtable;
import java.util.TreeSet;

public class hierarchical {


}
class parent {

    void show() {
        System.out.println("this method is in parent class");
    }
}
class child1 extends parent{
    void show1(){
        System.out.println("this method is in child1 class");
    }
}
class child2 extends parent{
    void show2(){
        System.out.println("this method is in child2 class");
    }

public static void main(String[]args){
        child1 ch1=new child1();
        ch1.show();
        ch1.show1();
        child2 ch2 =new child2();
        ch2.show();
        ch2.show2();
    System.out.println( ch2 instanceof child2);

    
}}