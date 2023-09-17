package ExceptionHandiling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class FileReader1 {
    static int count=0;
    public static void main(String[] args) {
        try {
            FileReader file= new FileReader("test.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()){
                String line = sc.next();
                System.out.println(line);
                count++;
                System.out.println(count+line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
finally {

        }
    }
}
