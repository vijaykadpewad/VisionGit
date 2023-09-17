package inheritance;

public class C {
    private int x=50;
    void m1(){
        System.out.println(x);

    }
}
 class D extends C{


}
class Test{
    public static void main(String[] args){
        C c=new C();
        c.m1();
    }

}