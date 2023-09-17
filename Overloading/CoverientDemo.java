package Overloading;

public class CoverientDemo{

}
class parent1{
     parent1 test(){
         System.out.println("we will go to nande");
        return new parent1();


    }
}
class child1 extends CoverientDemo{
    child1 test(){
        System.out.println("nanded is nic city and beautiful nanded");
        return new child1();


    }

    public static void main(String[] args) {
       parent1 p= new parent1();
      //  parent1 n=new parent1();
        p.test();
     //   n.test();
    }


}