package String;

public class Str9 {
    public static void main(String[] args) {
        String vijay1 = "vijay";//scp
        String vijay2="vijay11";//scp
        String ss=new String("vijay");
        String ss1=new String("vijay");
       // System.out.println(vijay1.equals(vijay2));
       // System.out.println(vijay1==vijay2);
        String ss3=ss1.intern();
        System.out.println(ss3);
        System.out.println(ss3==ss1);
    }
}
