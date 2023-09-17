package String;

public class Split {
    public static void main(String[] args) {
        String str="java is opp";
        String reverse="";
        String a[]=str.split(" ");
        for (int i=a.length-1;i>=0;i--)
        {
            reverse=reverse+a[i]+ " ";
        }
        for (int i=reverse.length()-1;i>=0;i--){
            System.out.print(reverse.charAt(i));
        }
        System.out.println(str.trim());
    }
}
