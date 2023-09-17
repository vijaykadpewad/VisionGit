package Java8FunctionalDemo;

import java.util.function.Function;
//Function--both input and output
public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer,String> getResult=v->v*10+" multiply by 10";
        System.out.println(getResult.apply(40));
    }
}
