package Java8features;



public interface BCD {

    void run();
    static void show(){
        System.out.println("This method is static");

    }
    default void test(){
        System.out.println("this method is default");

    }

}
class Two implements BCD{
  public  void run(){

    }
    public void show() {
        System.out.println("this method is normal");
    }
    public void test(){
        System.out.println("this method is test");

    }


}