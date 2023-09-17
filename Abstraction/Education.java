package Abstraction;

import java.sql.SQLOutput;

abstract class  subject{
    abstract void read();
void write (){
    System.out.println("this method is in subject class");
}
}
abstract class exam extends subject{
    abstract void submit();
    void read(){
        System.out.println("this method is in abstract class");
    }
}
class test1 extends exam{
    void submit(){
        System.out.println("this method is in finally completed");
    }

    public static void main(String[] args) {
        test1 t=new test1();
        t.submit();
        t.write();
        t.read();
    }
}