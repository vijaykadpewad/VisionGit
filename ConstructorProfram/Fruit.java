package ConstructorProfram;
class Tom{
    Tom(){
        System.out.println("Mango class co no para ");
    }
    Tom(String vijay){
        System.out.println("this class has string con");

    }
    Tom(int a){
        System.out.println("Tom class int para con");

    }
    Tom(double i,float jj){
        System.out.println("tom class double , float para con");
    }
}
class Jerry extends Tom{
    Jerry(int d){
        System.out.println("jerry class has in para con");
    }
    Jerry(double s){
        System.out.println("jerry class double para con");
    }
    Jerry(String ff,double tt){
        System.out.println("jerry class string double con para");
    }
}
public class Fruit {
}
