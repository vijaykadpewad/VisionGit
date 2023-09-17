package Abstraction;

abstract class dog{
    abstract void sound();
}
abstract class cat extends dog{
    void sound()
    {
        System.out.println("Barking");
    }
    abstract void color();
}
class animal1 extends cat{
    @Override
    void color() {
        System.out.println("Dog is black");
    }

    public static void main(String[] args) {
        animal1 a=new animal1();
        a.color();
        a.sound();
    }
}
