package Compare;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {


        List<Employee> list = new ArrayList<>();
        Employee e1 = new Employee(11, "vijay", "nanded", 50000d, 'B');
        Employee e2 = new Employee(22, "neha", "pune", 90000d, 'A');
        Employee e3 = new Employee(10, "angad", "latur", 60000d, 'C');
        Employee e4 = new Employee(04, "ketki", "mumbai", 70000d, 'D');
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        //  Collections.sort(list);
        //  System.out.println(list);

        CompareByName cpr1 = new CompareByName();
      //  Collections.sort(list, cpr1);
        //System.out.println(list);

        CompareBySalary cpr2=new CompareBySalary();
        Collections.sort(list, cpr2);
        System.out.println(list);
    }
}

class Employee implements Comparable<Employee> {
    private int EmpId;
    private String EmpName;
    private String Add;
    private double Salary;
    private char Grade;

    Employee(int empId, String empName, String add, double salary, char grade) {
        this.EmpId = empId;
        this.EmpName = empName;
        this.Add = add;
        this.Salary = salary;
        this.Grade = grade;
    }

    @Override
    public String toString() {
        return "Employee { EmpId : " + EmpId +
                "  EmpName :" + EmpName +
                "   Address :" + Add +
                "   Salary : " + Salary +
                "   Grade : " + Grade + " } "


                ;
    }

    public int getEmpID() {
        return EmpId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public String getAdd() {
        return Add;
    }

    public Double getSalary() {
        return Salary;

    }

    public char getGrade() {
        return Grade;
    }

    @Override
    public int compareTo(@NotNull Employee o) {
        return this.EmpId - o.EmpId;
    }
}

class CompareByName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmpName().compareTo(o2.getEmpName());
    }
}

class CompareBySalary implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getSalary() > o2.getSalary()) {
            return 1;
        } else if (o1.getSalary() < o2.getSalary()) {
            return -1;
        }

        return 0;

    }
}