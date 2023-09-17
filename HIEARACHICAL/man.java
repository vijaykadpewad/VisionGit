package HIEARACHICAL;

public class man {
}
class suresh{
    int S(){
    System.out.println("suresh class");
    return 10;
    }
}
class ramesh extends  suresh{
    int r(){
        System.out.println("ramesh class");
        return 20;
    }
}
class himesh extends suresh{
    int h(){
        System.out.println("himesh class");
        return 15;
    }
    public static void main(String[]args){
        ramesh rm=new ramesh();
        rm.S();
        rm.r();
        himesh hm=new himesh();
        hm.S();
        hm.h();
    }
}