package VIJAYPRACTICE;

public class DemoStringToMap {
    public static void main(String[] args) {
        String str="We23 4A2re Jav7a Deve3loper";
        String[] splited = str.split(" ");


        for(String word :splited){
            StringBuilder strb=new StringBuilder();
            StringBuilder strf=new StringBuilder();

             for (char c: word.toCharArray()){
                 if(Character.isLetter(c)) {
                     strb.append(c);
                 }else if (Character.isDigit(c)){
                     strf.append(c);

                 }
             }
             String processedword =strb.toString();

             int frequency=strf.length()>0? Integer.parseInt(strf.toString()):1;
            System.out.println(frequency+ " " + processedword);
        }


       /*    output:- key - value
                  5      we
                  6      are
                  7      Java
                  3      Developer   */
    }
}
