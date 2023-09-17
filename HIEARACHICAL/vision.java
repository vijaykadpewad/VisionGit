package HIEARACHICAL;

public class vision {
}
class saurav{
    char s(char a){
        System.out.println("this method is in saurav class");
        return 'a';
    }

}
class gaurav extends saurav{
    char g(char a){
        System.out.println("this method is in gaurav class");
        return 'a';
    }
}
class rav extends saurav{
    char r(char a){
        System.out.println("this method is in rav class");
        return 'a';
    }

    public static void main(String[] args) {
        gaurav gr= new gaurav();
        gr.g('b');
        gr.s('m');
        rav rv=new rav();
        rv.r('n');
        rv.s('o');
    }
}