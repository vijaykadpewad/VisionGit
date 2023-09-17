package Abstraction;
abstract class student{
    student(){}
    abstract void details();
}
abstract class std extends student{
    abstract void id();
    void details()
    {
        System.out.println(" Java  class");
    }
    void get()
    {
        System.out.println("This is the java");
    }
}
class clg extends std{

    void details(){
        System.out.println("This is chat bot");
    }
    void id(){
        System.out.println("This is java");
    }

    public static void main(String[] args) {
        clg c=new clg();
        c.details();
        c.get();
        c.id();
    }
}

