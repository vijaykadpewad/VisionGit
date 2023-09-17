package toString;

import java.security.PrivateKey;

public class ToString {
    ToString(){}

    public ToString(String firstName, String lastName, int rollNumber, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNumber = rollNumber;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ToString{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNumber=" + rollNumber +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
     ToString ts=new ToString("vijay","kadpewad",5,50000);
        System.out.println( "default"+ts.toString());
    }

    private String firstName;
    private String lastName;
    private int rollNumber;
    private double salary;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
