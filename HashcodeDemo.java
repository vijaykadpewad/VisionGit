public class HashcodeDemo {
    public static void main(String[] args) {
        HashcodeDemo hd=new HashcodeDemo();
        System.out.println(hd.hashCode());



        HashcodeDemo hd1=new HashcodeDemo();
        System.out.println(hd1.hashCode());
        String str="vijay";
        String str1=new String("vijay");
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
        System.out.println();
    }
}
