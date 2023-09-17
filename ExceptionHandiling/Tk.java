package ExceptionHandiling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tk {
    void get() throws FileNotFoundException {

            FileReader read = new FileReader("tt.txt");

        }
    }
class Main1{
    public static void main(String[] args) throws FileNotFoundException {
        Tk t=new Tk();
       // t.get();
       try {
           t.get();
       }
           catch ( FileNotFoundException e){
           e.printStackTrace();
           }
        System.out.println("vijay");
    }
}