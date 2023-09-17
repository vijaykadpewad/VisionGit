package ConstructorProfram;
class grandmother{
    grandmother(){
        this(10);
        System.out.println("this is  default constructor");
    }
    grandmother(int a){
        System.out.println("this is   int  constructor");
    }
}
class mother extends grandmother{
    mother(){
        this("vij",88);
        System.out.println("this is  default constructor");
    }
    mother(String a, int b){
        System.out.println("this is  string  constructor");
    }
}
class Child extends mother{
    Child(){
        this(66,88);
        System.out.println("this is  default constructor");
    }
    Child( int a,int b){
        System.out.println("this is int constructor");}
}
class progra5 extends Child{
    public static void main(String[] args) {
        progra5 obj= new progra5();
    }
}


