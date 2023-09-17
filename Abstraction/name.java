package Abstraction;

abstract class name{
    abstract void student();

}
abstract class Year extends name{
    @Override
    void student() {
        System.out.println("I am a student");
    }
    abstract void area();
}
class month extends Year{
    @Override
    void area() {
        System.out.println("My Name is vijay");
    }

    public static void main(String[] args) {
        month m= new month();
        m.area();
        m.student();
    }
}