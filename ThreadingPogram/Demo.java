package ThreadingPogram;

public class Demo extends Thread {
    @Override
    public void  run() {

        for (int i = 0; i <= 5; i++) {
            System.out.println("count is" + " " + "thread name  is "+i + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Demo t1 = new Demo();
        t1.setName("vijay");
        t1.start();

        Demo t2 = new Demo();
        t2.setName("kadpewad");
        t2.start();

    }
}
