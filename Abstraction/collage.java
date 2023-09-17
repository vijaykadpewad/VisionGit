package Abstraction;



import javax.sound.midi.Soundbank;

abstract class Ten{
    abstract void marks();
    abstract int getMarks();
}
abstract class Nine extends Ten{
    abstract void result();
    int getMarks(){
        System.out.println("this method is in Nine class");
            return  60;
        }
    }

class Eight extends Nine{
    @Override
    void marks() {
        System.out.println("this method is in ten class");

    }

    @Override
    void result() {
        System.out.println("result method is in Nine class");

    }

    public static void main(String[] args) {


Eight n= new Eight();
    n.marks();
    n.result();
    n.getMarks();

}}