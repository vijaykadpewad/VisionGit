package immiutable;

 final class Immutable {


         private final int id;
         private final String name;
         Immutable(int id,String name){

         this.id=id;
         this.name=name;

     }
     public int getId(){
             return id;
     }
     public String getName(){
             return name;
     }

     public static void main(String[] args) {
         Immutable im=new Immutable(1,"vijay1") ;
         System.out.println(im.id);
         System.out.println(im.name);
     }
 }