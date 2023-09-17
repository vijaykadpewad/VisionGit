package ConstructorProfram;
class red{
    red() {
        System.out.println("this class has con.with red");
    }
    red(int a){
        this();
            System.out.println("red class has con. para int with red");
        }
        red(String vk){
        this(77F);
            System.out.println("red class has con with string para");
        }
        red(float b){
        this(55);
            System.out.println("red class has con with float para");
        }

    }
    class orange extends red{
    orange(){
        this("vijay",89);
        System.out.println("orange class has no para");
    }
    orange(int c){
        super("mohan");
        System.out.println("orange class has con with int para");
    }
    orange(String vmk,int o){
        this(55);
        System.out.println("orange class has con with string and int para");
    }
    orange(String pk, int p, int k){
        this();
       // super("Mohan");

        System.out.println("orange class has con with string, int, int para");
    }
    }
class voilet extends orange{
    voilet(){
        this(10,78,88);
        System.out.println("voilet class con has no para");
    }
    voilet(int h){
        this("jay");
        System.out.println("voilet class con has float para");
    }
    voilet(String  jay){
        super("vijay",90,88);
        System.out.println("voilet class con has double para");
    }
    voilet( int a, int n,int w){
        this(88);

        System.out.println("voilet class con has int, int, float para");
    }
}
public class Colour extends voilet {
    Colour(){
        this(88);
        System.out.println("Colour class has no para con");
    }
    Colour(int g){
        super();
        System.out.println(" color class has para con");
    }
    void Colour(){
        System.out.println("child class mathod");
    }
    public static void main(String[] args) {

        Colour v=new Colour();
        v.Colour();
    }
}
