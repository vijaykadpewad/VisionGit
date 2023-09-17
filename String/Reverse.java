package String;

public class Reverse {
    public static void main(String[] args) {
        String s1="java program";
        String Reverse="";

        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
           Reverse =ch+Reverse;

        }
        System.out.println(Reverse);
    }

}
