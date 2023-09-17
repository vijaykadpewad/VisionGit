package polymorphism;

public class Numbers {
    public static void main(String[] args) {
        Numbers num =new Numbers();
        num.method1();
        num.method1(50);
        num.method1(90,60);
        num.method1(44,33,44);
        num.method2(55);
        num.method2(23,43);
        num.method2(10,"vijay");
        num.method2(90,33,98);
    }
    void method1 (){
        System.out.println("method1 has no para");

    }
    void method1 (int a){
        System.out.println("method1 has int para");
    }
    void method1 (int a,int b){
        System.out.println("method 1 has int, int para");
    }
    void method1 (int a, int b,int c){
        System.out.println("method 1 has int, int ,int para");
    }
    void method1 (short a){
        System.out.println("method 1 has short para");
    }void method2 (int a){
        System.out.println("method 2 has int para");
    }void method2 (int b,int c){
        System.out.println("method 2 has int ,int");
    }void method2 (int a,String vij){
        System.out.println("method 2 has int ,string para");
    }void method2(int f,int g,int h){
        System.out.println("mothod2 has int, int, int para");
    }
}
