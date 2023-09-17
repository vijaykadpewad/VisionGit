package package1;

public class Test2 {
    public static void main(String[] args)
{
    B b = new B();
    System.out.println(b.x);

    A a = new A();
    System.out.println(a.x);

    A a2 = new B();
    System.out.println(a2.x);

}
}

