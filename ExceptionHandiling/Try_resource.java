package ExceptionHandiling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Try_resource {
    public static void main (String[]args) throws FileNotFoundException,IOException {
        File f=new File("test.txt");
        try(FileReader fr =new FileReader(f);){
            int i=0;
            while((i=fr.read())!=-1){
                System.out.print((char)i);
            }
        }
    }
}
class x{
    public  static void  throwit(){
        throw  new RuntimeException();

    }

    public static void main(String[] args) {


        String s1= null;
        System.out.println(s1);
        System.out.println(s1.toString());
     /*   try {
            System.out.println("Heloo world");
            throwit();
            System.out.println("Done");

        }
        finally {
            System.out.println("finally");
        }
    }*/
}}
