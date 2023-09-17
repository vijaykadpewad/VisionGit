package encapsulation;

public class Profile {
    public static void main(String[] args) {
        Profile pf=new Profile();
        pf.setFirstName("Vijay");
        pf.setLastName("kadpewad");
        pf.setMiddleName("Maroti");
        pf.setAddress("Nanded");
        pf.setEmployeeId(88);
        pf.setSalary(50000d);
        System.out.println("First Name--"+ pf.getFirstName());
        System.out.println("Last Name--"+ pf.getLastName());
        System.out.println("Middle Name--"+ pf.getMiddleName());
        System.out.println("Address--"+ pf.getAddress());
        System.out.println("Empolyee Id--"+ pf.getEmployeeId());
        System.out.println("Salary--"+ pf.getSalary());
    }
    private String firstName;
    private String lastName;
    private String middleName;
    private String address;
    private int employeeId;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    }
