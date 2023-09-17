package Interface;

public class Test implements a,b {

    @Override
    public void test() {

    }

    @Override
    public void test1() {

    }
}
interface a extends b{
    void test();
}
interface b{
    void test1();
}