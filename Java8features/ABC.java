package Java8features;

public interface ABC {
  default   void test(){
      System.out.println("This method is in interface Abc");
  }
}
class One implements ABC{
     public void test(){
         System.out.println("This method is in class One");

    }

}
