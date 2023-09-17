package Interface;

public interface Program3 {
     void get();
}
interface program4 extends Program3{
    void get1();
}
abstract class program6 {
   abstract void get3 ();

}
class program5 extends program6 implements program4{

    @Override
    public void get() {

    }

    @Override
    public void get1() {

    }

    @Override
    void get3() {

    }
}