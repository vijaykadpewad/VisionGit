package ExceptionHandiling;

import java.io.IOException;

public class ThrowsTest {
}
class A{
    void get(){
        System.out.println("this method is in class A");
    }
}
class B  {

    void show() throws Exception {
        A a = null;//null pointer
        a.get();
        System.out.println("this method is in class B");
    }
}
class C{
    void run() {
        B b = new B();
     // b.show();


        System.out.println("this method is in class C");
    }
}

class Main {
        public static void main(String[] args) {
            C c = new C();
            c.run();
        }

        }

