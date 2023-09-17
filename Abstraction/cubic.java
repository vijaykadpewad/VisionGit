package Abstraction;

abstract class  cubic{
    abstract void get();

}
abstract class area4 extends cubic{
    abstract void area();
}
class result4 extends  area4{
    void get(){
        int a=4,res;
        res=a*a*a;
        System.out.println("cube is"+ res);
    }
    void area(){

        System.out.println("this is the cube");

    }

    public static void main(String[] args) {
        result4 r= new result4();
        r.area();
        r.get();
    }
}