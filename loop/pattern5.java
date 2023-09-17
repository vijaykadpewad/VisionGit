package loop;

public class pattern5 {
    public static void main(String[] args) {


        int n = 5;
        for (int i = 1; i <= n; i++) {

            for (int j=1;j<=i;j++) {
                System.out.print(" ");
            }

            for(int k=i;k<=n;k++)
            {

                System.out.print(" *");}
            System.out.println();

        }
        System.out.println("\n" +
                " ╭╮╱▔▔▔▔▔╲╭╮┃\uD83C\uDD57\uD83C\uDD5E\n" +
                "  ╰╱╭▅╮ ╭▅╮╲╯┃\uD83C\uDD5B\uD83C\uDD50!\n" +
                "   ▏╰╱▔▇▔╲╯▕ ┻━━\n" +
                "╱╲ ▏ ▏ ┃ ▕ ▕ ╱╲ \n" +
                "▏ ╲╲ ╲╰┻╯╱ ╱╱ ▕ \n" +
                "╲  ╲╲ ▔▔▔ ╱╱  ╱ \n" +
                " ╲  ▔▕╲▂╱▏▔  ╱  \n" +
                "  ╲  ▕╱▔╲▏  ╱");
        int m= 5;
        for (int i = 1; i <= m; i++) {
            for(int j=i;j<=m;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }

            System.out.println();

        }
}}