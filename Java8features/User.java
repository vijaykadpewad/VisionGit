package Java8features;

 interface User1{
      String show();
 }
public class User implements User1 {
    public static void main(String[] args) {

        User user =new User();
        user.show();
        User1 us=new User1() {
            @Override
            public String show() {
                System.out.println("This is ananous");
                return "Angad";
            }
        };
        us.show();
        User1 us1=()->{
            System.out.println("This is lambda");
            return "sourav";
        };
        us1.show();


    }
        @Override
        public String show () {
            System.out.println("this is normal");
            return "Vijay";
        }
    }
