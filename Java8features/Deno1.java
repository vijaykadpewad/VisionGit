package Java8features;
interface Deno{
    void ring();

}
public class Deno1  implements Deno {

    @Override
    public void ring() {
        System.out.println("this is normal method");
    }

    public static void main(String[] args) {
Deno1 dn=new Deno1();
dn.ring();

Deno dd=new Deno(){
   public void ring(){
       System.out.println("this is ananmous");
    }
};
dd.ring();

Deno d1=()->{
    System.out.println("this is lamba");

};
d1.ring();
    }
}