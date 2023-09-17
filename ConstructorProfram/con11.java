package ConstructorProfram;

//public class con11 {
//
//}
class con13 {
    con13() {
        System.out.println("parent constructor");
    }

    {
        System.out.println("parent instance");
    }

    static {
        System.out.println("parent static block");
    }
}
    public class con11 extends con13 {
        con11() {
            System.out.println("constructor");
        }

        static {
            System.out.println("static block");

        }

        {
            System.out.println("instance block");
        }

        public static void main(String[] args) {
            con11 c12=new con11();

        }


    }


