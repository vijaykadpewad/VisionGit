package Java8FunctionalDemo;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        //Function interface type 4
        //1) Predicate--boolean return
        Predicate<String> checkLength=str->str.length()>5;
        //checking if length of string is>5--true--else--false
        System.out.println(checkLength.test("vijaya"));
    }
}
