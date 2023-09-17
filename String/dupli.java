package String;

public class dupli {


    public static void main(String[] args) {
        String test="adfjkdjklslkjlkdsjklflk";
        String word="java";
        int count=0;
        int index=0;
        while(index!=-1){
            index=test.indexOf(word,index);
            if(index!=-1){
                count++;
                index=index+word.length();
            }
        }


    }
}