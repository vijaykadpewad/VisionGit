package ExceptionHandiling;

public class SOF {
}
class N{
    void m(){

        this.m1();
        System.out.println("hell");
    }
    void m1(){
        this.m();
        System.out.println("hii");
    }

    public static void main(String[] args) {
        N n=new N();
        n.m();
    }
}