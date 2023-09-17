package variable;

public class Value {
   int a=10;
   static int b=1;

Value(){
    a++;
    System.out.println("printing non static variable"+a);
   b++;
    System.out.println("Printing static variable"+b);

}

    public static void main(String[] args) {
        Value v =new Value();
        Value i =new Value();
        Value j=new Value();

    }
}