package loop;

public class pattern4 {
    public static void main(String[] args) {


        int n = 4;
        for (int i = 1; i <=n; i++) {
            for (int j = i; j <n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            for (int k = i; k<n; k++) {
                System.out.print("  ");
            }
            for (int l = 1; l <= i; ++l) {
                System.out.print(" * ");
            }

            System.out.println();

        }
        System.out.println("*  *  *  *  *  *  *  *  *");

    }
}