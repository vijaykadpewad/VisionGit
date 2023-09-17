package Overloading;

public class sys {

}
class System1{
    void getNumber(){
        System.out.println(" class system1 has getumber method");
    }
    void getSalary(){
        System.out.println("class system1 has getSalary method");
    }
}
class System2 extends System1{
    @Override
    void getNumber(){
        System.out.println("class system2 has getnumber method");

    }
@Override
void getSalary(){
        System.out.println("class system2 has getsalary method");

    }
}