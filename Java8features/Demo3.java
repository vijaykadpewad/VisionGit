package Java8features;


interface Demo5{
    void ring();

}
public class Demo3  implements Demo5 {

    @Override
    public void ring() {
        System.out.println("this is normal method");
    }

    public static void main(String[] args) {
        Demo5 dn= new Demo5() {
            @Override
            public void ring() {

            }
        };
        dn.ring();

        Demo5 dd=new Demo5(){
            public void ring(){
                System.out.println("this is ananmous");
            }
        };
        dd.ring();

        Demo5 d1=()->{
            System.out.println("this is lamba");

        };
        d1.ring();
    }
}