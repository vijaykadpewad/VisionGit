package HIEARACHICAL;

public class Birds {

}
class birds{
    String sound (String snd){
        System.out.println("Birds sound");
        return "Snd";
    }
}
class parrot extends  birds{
    String sound1(String snd1){
        System.out.println("Parrot sound");
        return"Snd1";
    }
}
class owl extends  birds{
    String sound2(String snd2){
        System.out.println("owl sound");
        return "Snd2";
    }
    public static void main (String []args){
        parrot prt=new parrot();
        prt.sound("birr");
        prt.sound1("prtt");
        owl ol=new owl();
        ol.sound("birr");
        ol.sound2("oll");

    }
}
