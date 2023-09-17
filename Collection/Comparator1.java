package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator1 {
    private int rollNo;
    private String empName;
    private double salary;
private char vk;
    public Comparator1() {

    }

    public Comparator1(int rollNo, String empName, double salary,char vk) {
        this.rollNo = rollNo;
        this.empName = empName;
        this.salary = salary;
        this.vk=vk;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }
    public void setVk(char vk){
        this.vk=vk;
    }
    public char getVk(){
        return vk;
    }

    public void setSalary() {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Comparator1{" +
                "rollNo=" + rollNo +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", vk=" + vk +
                '}';
    }

    public static void main(String[] args) {
        Comparator1 com = new Comparator1(001, "Mohan", 50000,'A');
        Comparator1 com1 = new Comparator1(002, "Sohan", 60000,'S');
        Comparator1 com2 = new Comparator1(003, "Rohan", 45000,'K');
        Comparator1 com3 = new Comparator1(004, "Raghav", 50000,'D');
        Comparator1 com4 = new Comparator1(001, "Ganesh", 50000,'O');

        List<Comparator1> obj = new ArrayList<>();
        obj.add(com);
        obj.add(com1);
        obj.add(com2);
        obj.add(com3);
        obj.add(com4);

       /* empName comparator = new empName();
        Collections.sort(obj,comparator);
        System.out.println("sort by empname"+obj);*/

        Salary comm = new Salary();
        Collections.sort(obj, comm);
        System.out.println("sort by salary" + obj);
         Vk vk=new Vk();
         Collections.sort(obj,vk);
        System.out.println("sort by vk"+obj);
    }
}

class empName implements Comparator<Comparator1> {

    @Override
    public int compare(Comparator1 o1, Comparator1 o2) {
        return o1.getEmpName().compareTo(o2.getEmpName());
    }
}

class Salary implements Comparator<Comparator1> {


    @Override
    public int compare(Comparator1 o3, Comparator1 o4) {
        if (o3.getSalary() < o4.getSalary())
            return -1;
        else if (o3.getSalary() > o4.getSalary()) {
            return 1;
        }
        return 0;
    }
}
class Vk implements Comparator<Comparator1>{

    @Override
    public int compare(Comparator1 o1, Comparator1 o2) {
        return o1.getVk()- o2.getVk();
    }
}