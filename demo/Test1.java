package demo;

public  abstract class Test1 {


        void show(){
            System.out.println("it is not mandatory to have abstract method in abstract class");
        }
    }
    class Test2 extends Test1 {
        void run(){
            String name = "nobbie";
            int age = 25;
            System.out.println(name);
            System.out.println(age);
        }
    }
    class base {
        public static void main(String[] args) {
            Test2 sc = new Test2();
            sc.show();
            sc.run();

        }


}
