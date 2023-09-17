package String;

public class Scp2 {
    public static void main(String[] args) {
        String v=("vijay");
        String v1=("vijay");
        String v2=new String("vijay");
        String v3=new String("vijay");
        System.out.println(v==v1);
        System.out.println(v2==v1);
        System.out.println(v3.equals(v2));
        System.out.println(v3==v2);

    }






}