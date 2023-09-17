package Java8features;
interface Demo1{
    void show();
}

public class LamdaTest implements Demo1 {
    public static void main(String[] args) {
        Demo1 dm=new Demo1() {
            @Override
            public void show() {
                System.out.println("this is ananous");
            }
        };
dm.show();
        Demo1 dd = () -> {
            System.out.println("by using lamba");
        };
        dd.show();
        LamdaTest lt=new LamdaTest();
        lt.show();

    }

    @Override
    public void show() {
        System.out.println("this is normal");
    }


}
