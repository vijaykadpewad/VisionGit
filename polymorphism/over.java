package polymorphism;

public class over {
    public static void main(String[] args) {


    over ov=new over();
    ov.get();
    ov.get(99);
    ov.get(14d);
    ov.get(7000d);
    ov.get("jay");
    ////////////////////////////////
    over rv =new over();
    rv.get1(33);
    rv.get1(77d);
    rv.get1(77,99);
    rv.get1(44,99,77);
    }

    void get(){
        System.out.println("Student name");
    }
    void get(int a){
        System.out.println("Student lastName");
    }
    void get(Double a){
        System.out.println("Student ID");
    }
    void get(String v){
        System.out.println("Student mobile number");
    }
    void get1( int a){
        System.out.println("get1 int");
    }

    void get1(int s,int h){
        System.out.println("get1 int, int");

    }
    void get1(double f){
        System.out.println("get1 double");
    }
    void get1(int g, int j,int s){
        System.out.println("get1 int,int,int");

    }
}
