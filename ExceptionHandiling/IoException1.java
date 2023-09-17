package ExceptionHandiling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IoException1 {
    void m1() {
        try {
            FileReader read = new FileReader("ttt.txt");
            try {
                int i;
                while ((i = read.read()) != -1) {
                    System.out.print((char) i);

                }
            } catch (IOException e) {
                e.printStackTrace();
                   System.out.println(e.getMessage());

            }
        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);
        }

    }
    public static void main(String[] args) {
        IoException1 io = new IoException1();
        io.m1();
    }
}
