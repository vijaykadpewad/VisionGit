package String;

public class DuplicateString {

    public static void main(String[] args) {
        String text = "mnbjaavafgjavabbmbgjkjavabjhkjh";
         String word = "java";
        int count = 0;
        int index = 0;
        while(index != -1) {
            index = text.indexOf(word, index);
            if (index != -1) {
               count++;
                index = index +word.length();
            }
        }

        System.out.println("The word \"" + word + "\" appears " + count + " times in the string.");
    }
}
