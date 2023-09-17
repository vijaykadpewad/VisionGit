package ExceptionHandiling;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        File file = new File("st.txt");
        try {
            FileOutputStream out = new FileOutputStream(file);
            out.write("notepad".getBytes());
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("file wasn't found. Aborting write");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO Exception . Couldn't finish writing the file");
        }
    }
}

