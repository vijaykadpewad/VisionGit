package Abstraction;

abstract class vehical {
    abstract void start();

    abstract void color();
}

abstract class car extends vehical {
    @Override
    void start() {
        System.out.println("Car Start with Key");
    }

    @Override
    void color() {
        System.out.println("Car color is Blue");
    }
}

class parking extends car {
    @Override
    void color() {
        System.out.println(" Left side parking");
    }

    public static void main(String[] args) {
        parking p = new parking();
        p.color();
        p.start();
    }
}
