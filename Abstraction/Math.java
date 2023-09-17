
package Abstraction;

abstract class math {
//    abstract int getMulti();

    abstract int getMulti(int a, int b);
}

abstract class multi extends math {
    @Override
    int getMulti(int a, int b) {
        int c = a * b;
        System.out.println("multi of two numbers" + c);
        return 0;

    }
}

class res extends multi {

    public static void main(String[] args) {
        res rs = new res();
        rs.getMulti(10, 20);
    }


}
