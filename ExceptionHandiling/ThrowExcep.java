package ExceptionHandiling;

// Java program that demonstrates the use of throw
     public class ThrowExcep{
        static void fun()
        {
            int a=10;
            int b=0;
            int c=a/b;
            try
            {
                throw new ArithmeticException("demo"+c);
            }
            catch(ArithmeticException e)
            {
                System.out.println("Caught inside fun().");
              //  throw e; // rethrowing the exception
            }
        }
        public static void main(String args[])
        {
            try
            {
                fun();
            }
            catch(NullPointerException e)
            {
                System.out.println("Caught in main.");
            }
            System.out.println("hii");
        }

    }

