package customexception;

public class Test {
}
class Userdefiner extends Exception{

    Userdefiner(String msg){
        super(msg);
    }

}
class User{
    public static void main(String[] args) {


    int a=90;
    if (a>100){
        System.out.println("a is greater than 100");

    }
    else {
        try {
            throw new Userdefiner("a is less than 100");
        } catch (Userdefiner e) {
           throw new RuntimeException(e);
        }
        //throw new Userdefiner("a is less than 100");
    }
}}