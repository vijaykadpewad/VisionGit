public class Student {
    Student(){
    }

    public Student(String name, String lastName, int rollNumber) {
     /*   this.name = name;
        this.lastName = lastName;
        this.rollNumber = rollNumber; */
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }

    public static void main(String[] args) {
        Student sd=new Student("vijay","kadpewad",88);

    }
     String name;
    String lastName;
    int rollNumber;

}
