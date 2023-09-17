package String;

public class Str6 {
    public static void main(String[] args) {
        String gg=new String("vijay");
        String gg1=new String("vision");
        String ee="vijay";
        String ee1=new String("vision");
        String ee2=new String("vijay");
        System.out.println(gg1==ee2);//false
        System.out.println(ee.equals(gg));//true
        System.out.println(ee1==gg);//false
        System.out.println(ee2.equals(gg));//true
    }
}
