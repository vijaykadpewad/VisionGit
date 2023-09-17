package String;

public class Pattern {


        public static void main(String[] args) {

            String word="VIJAY";
             int size=word.length();

            for (int i=0; i<size; i++) {
                for (int j=0; j<=size/2; j++) {
                    if(i == size/2 ){
                        System.out.print(word);
                        break;
                    } else {
                        if(j == size/2)
                            System.out.print(word.charAt(i));
                        else
                            System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

