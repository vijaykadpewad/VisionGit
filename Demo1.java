import java.util.HashMap;

public class Demo1 {
    final int x=10;
    public static void main(String[] args) {
        String s1 =new String("java");
        String s12 =new String("programming");
        s1=null;
        s12=null;
        System.gc();
        System.out.println(s1+s12);

        //final method overriden by subclass



    }
}
