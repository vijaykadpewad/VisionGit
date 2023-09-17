package ThreadingPogram;

public class SyncroDemo {}
    class RunnableDemo {
        public static void main(String[] args) {

            Object lock = new Object();
            Thread t1 = new Thread (new MyRunnable(lock));
            Thread t2 = new Thread (new MyRunnable(lock));

            t1.start();
            
            t2.start();
        }
    }

    class MyRunnable implements Runnable {
        Object lock = new Object();
        public MyRunnable(Object lock){
            this.lock = lock;
        }

        @Override
        public void run () {
            synchronized(lock){
                for (int i = 0; i <13; i++) {
                    System.out.println(i+"vijay ");
                }
            }
        }
    }

