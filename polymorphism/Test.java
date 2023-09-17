package polymorphism;

public class Test {
}
    class overloading {
        public void main (String[]args){
            overloading test= new overloading();
            test.pro1();
            test.pro1(5);
            test.pro1(19,99);
            test.pro1("abc",5);
        }

        void pro1 (){
            System.out.println("default");

        }
        void pro1(int a){
            System.out.println("this is int method");
        }

        void  pro1(int a,int b){
            System.out.println("this is 2 int");
        }

        void pro1(String a,int b){
            System.out.println("this is string int method");
        }
    }

