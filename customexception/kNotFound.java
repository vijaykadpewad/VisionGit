package customexception;

public class kNotFound extends RuntimeException{
    kNotFound(String abc){
        super(abc);
    }
}

class Angad{
    public static void main(String[] args) {
        int a =30;
        int b=20;
        if(a<b){
            System.out.println("print a");
        }else{
            throw new kNotFound("ok not found");
        }
    }
}
