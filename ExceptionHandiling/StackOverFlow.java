package ExceptionHandiling;

public class StackOverFlow {
    void get(){
        this.show();
    }
    void show(){
        this.get();
    }
    public static void main(String[]args){
        StackOverFlow st=new StackOverFlow();
  //         try {
//               st.get();
//           }
//     //      catch (Exception e){
//               System.out.println(e);
//           }
//        System.out.println("Hello");
  }
}
