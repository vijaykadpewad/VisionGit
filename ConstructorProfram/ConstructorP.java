package ConstructorProfram;

import java.util.concurrent.Callable;

class Con1{
    Con1(){
        System.out.println("this is cons in grandparent class no para");
    }
    Con1(int a){
        this();
        System.out.println("this is con in grandparent class int para");

    }
    Con1(int b, String vijay){
        this(88);
        System.out.println("this con is in grandparent class having int,string para");
    }
    Con1(int c,int d, String ajay){
        this(60,"soarav");
        System.out.println("this con is in grandparent class having int,int,string para");
    }

}
class Con2 extends Con1{
    Con2(){
        super(14,16,"vijay");
        System.out.println("this con is in parent class no para");
    }
    Con2(int a){
        this();
        System.out.println("this is con is in parent class having int para");
    }
    Con2(int b,String jay){
        this(15);
        System.out.println("this con is in parent class having int ,string para");
    }
    Con2(String jaya, int d, String vijaya){
        this(10,"vij");
        System.out.println("this con is in parent class having string, int, string para");
    }
}

public class ConstructorP extends Con2{
    ConstructorP(){
        this(10);


        System.out.println("this con is in conp class having no para");
    }
    ConstructorP(int a){
        this("gaorav",66);
        System.out.println("this con is in conp class having int para");

    }
    ConstructorP(String sourav,int b){
        this(10,88,66);
        System.out.println("this con is in conp class having String int para");
    }
   ConstructorP(int d,int f,int g){
       super("jjj",10,"jayy");
       System.out.println("this con is in conp class having int,int, int para");
   }

    public static void main(String[] args) {
        ConstructorP cp=new ConstructorP();






        }
    }

