package Java8features;
@FunctionalInterface  // only one abstract method
public interface Demo {

   public void run();

}
class Normal implements Demo{
    @Override
   public void run(){

    }
}