package Overloading;

public class parent {
parent get(){
    parent pr=new parent();
    System.out.println("parent class");
    return pr;
        }
}
class child extends parent{
    @Override
    parent get(){
        child pp=new child();

        System.out.println("child parent");
        return pp;
    }

    public static void main(String[] args) {
        parent jj=new child();
        jj.get();
    }
}