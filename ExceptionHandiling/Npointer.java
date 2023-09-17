package ExceptionHandiling;

public class Npointer {
    void show() {
        System.out.println("Hello");
    }
}

class ClassB {
    public static void main(String[] args) {
        Npointer np = null;
        try {
            np.show();

        } catch (NullPointerException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
