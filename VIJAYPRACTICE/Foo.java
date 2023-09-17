package VIJAYPRACTICE;

import java.io.*;

public class Foo implements Serializable {
    public int x,y;
    public void Foo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    private void writeObject(ObjectOutputStream s)  throws IOException{
         s.writeInt(x); s.writeInt(y);  }

   // x = s.readInt(); y = s.readInt();
    private void readObject(ObjectInputStream s)
        throws IOException,ClassNotFoundException{

    }
}
