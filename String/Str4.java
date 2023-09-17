package String;

public class Str4 {
    public static void main(String[] args) {


        String s1 = "jay";
        String s2 = "jay";
        String st = new String("vijay");
        String st1 = new String("jay");
        System.out.println(s1==st1);//false
        System.out.println(st==s2);//false
        System.out.println(st1.equals(s1));//true
        System.out.println(st.equals(s2));//false

    }
}