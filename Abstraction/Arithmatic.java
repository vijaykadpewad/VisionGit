package Abstraction;


abstract class Add{
   abstract void addition() ;

}
abstract class sub extends Add{
    abstract void sub();
    void add(){
        int a=10,b=20,c;
        c=a+b;
        System.out.println("Addition"+ " " +c);


    }
}
class result extends sub{
    @Override
    void addition() {
        System.out.println("Arithmatic operator");
    }

    @Override
    void sub() {
        int a=10,b=20,c;
        c=a-b;
        System.out.println("SUbstaction"+ " " +c);

    }

    public static void main(String[] args) {
        result rs=new result();
    rs.addition();
    rs.add();
    rs.sub();
    }

}