package ExceptionHandiling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Test2 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream obj = new FileInputStream("C:/Java programs/Basic programs");

        }
           catch (FileNotFoundException e) {
                System.out.println(e);
               System.out.println("Hii");
            throw new SuarabhNotFound("FILE NOT FOUND");
            }
        System.out.println("Hello");
        }


    }
class SuarabhNotFound extends RuntimeException{
    SuarabhNotFound( String msg){
       super(msg) ;
    }
}