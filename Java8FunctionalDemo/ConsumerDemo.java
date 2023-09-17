package Java8FunctionalDemo;

import java.util.function.Consumer;
//Consumer--modifies data--no output
class Demo{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
public class ConsumerDemo {
    public static void main(String[] args) {
        Demo d=new Demo();
        Consumer<Demo> setName=k->k.setName("vijay");
        setName.accept(d);
        System.out.println(d.getName());

    }
}
