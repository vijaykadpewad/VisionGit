package Thread;

public class Thread1 extends Thread
{
    @Override
    public void run()
    {
        for (int i = 1; i <= 1000; i++)
        {
            System.out.println(i);
        }
    }
}

//Thread2 : The task of this thread is to print numbers from 1001 to 2000

    class Thread2 extends Thread
    {
        @Override
        public void run()
        {
            for (int i = 1001; i <= 2000; i++)
            {
                System.out.println(i);
            }
        }
    }
    class JavaThreadsInterviewQuestions
    {
        //Main Thread : The task of this thread is to execute main() method

        public static void main(String[] args)
        {
            //Creating and starting first thread

            Thread1 t1 = new Thread1();
            t1.start();

            //Creating and starting second thread

            Thread2 t2 = new Thread2();
            t2.start();

            //Both these two threads will be executed simultaneously
        }
    }

