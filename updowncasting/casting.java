package updowncasting;
class parent{
   void parent(){
        System.out.println("vk66");
    }
}
class child extends parent
{

  void  parent(){
        System.out.println("vk");
    }
    void parent55(){
        System.out.println("vvk");

    }

    public static void main(String[] args) {
        parent ch= new child();
       // ch.parent();
        ch.parent();
       // ch.parent55();
    }
}
 public  class casting extends child {

     }
