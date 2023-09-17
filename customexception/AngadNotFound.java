package customexception;

public class AngadNotFound extends RuntimeException{
    public AngadNotFound(String msg){
        super(msg);
        // super.getmessage();
        //super.num;

    }
}
class Angya{
    public static void main(String[] args) {
        int a=17;
        int b=0;
        if(a>b){
            throw new AngadNotFound("Angad went to Meet Hanumanji ");
        }else{
            System.out.println("Angad likes Hanumanji");
        }
    }
}
