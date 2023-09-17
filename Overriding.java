


class Program {

    void run(int d){
        System.out.println("class program 2 method");

    }
}

public class Overriding extends Program{
    @Override
    void run(int d){
        System.out.println("class program 1 method");

}
    public static void main(String[] args) {
        Program pr=new Program();
        pr.run(9);
    }
}
