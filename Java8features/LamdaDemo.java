package Java8features;
interface inter{
    void get(String a);
}
public class LamdaDemo implements inter {
    public static void main(String[] args) {
        LamdaDemo ld=new LamdaDemo();
        ld.get("Angad");
        inter i=new inter() {
            @Override
            public void get(String a) {
                System.out.println("this is ananomus method");
            }
        };
        i.get("Sourav");

        inter ii=(String a) -> {
            System.out.println("This is lambda method");
        };
        ii.get("Vijay");


    }


        @Override
        public void get (String a){
            System.out.println("This is normal method");
        }



}