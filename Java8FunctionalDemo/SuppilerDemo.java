package Java8FunctionalDemo;

import java.util.function.Supplier;

public class SuppilerDemo {
    public static void main(String[] args) {
        //supplier-only output
        Supplier<Double> getRandomDouble=()->Math.random();
        System.out.println(getRandomDouble.get());}
}
