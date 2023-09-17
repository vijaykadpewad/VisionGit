package demo;

public class Demo_Class implements Rest {

    @Override
    public void addition() {

    }

    @Override
    public void subtraction() {
        Rest.super.subtraction();
    }
}
@FunctionalInterface
interface Rest{
    void addition();
    default  void subtraction(){};
    static void add(){}

}
