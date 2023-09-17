package String;

public class Scp3 {
    public static void main(String[] args) {
        String str="String";
        String str1=new String("String");
        String str3="String1";
        String str4="String1";
        System.out.println(str4==str3);//true
        System.out.println(str3==str);//false
        System.out.println(str4.equals(str3));//true
        System.out.println(str.equals(str4));//false
        System.out.println(str1.equals(str3));//false
    }
}
