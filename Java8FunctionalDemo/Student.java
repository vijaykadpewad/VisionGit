package Java8FunctionalDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Student {
    int id;
    String name;
    double percentage;
    String specialization;

    public Student(int id, String name, double percentage, String specialization) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getSpecilization() {
        return specialization;
    }

    @Override
    public String toString() {
        return id + "_" + name + "_" + percentage + "_" + specialization;
    }

    public static void main(String[] args) {

        List<Student> listOfStudent = new ArrayList<Student>();
        listOfStudent.add(new Student(111,"vijay",81.0,"Mathematics" ));
        listOfStudent.add(new Student(222,"Shubham",79.5,"History"));
        listOfStudent.add(new Student(333,"sourabh",87.2,"Computers"));
        listOfStudent.add(new Student(444,"Parth",63.2,"Mathematics"));
        listOfStudent.add(new Student(555,"Akash",83.5,"Computers"));
        listOfStudent.add(new Student(666,"Akashy",58.5,"Geography"));

        Predicate<Student> mathematicsPredicate=(Student student) ->student.getSpecilization().equals("Mathematics");
    List<Student> mathematicsStudents =new ArrayList<Student>();
    for(Student student : listOfStudent)
        {
            if(mathematicsPredicate.test(student));
            {
                mathematicsStudents.add(student);
            }
        }
    Consumer<Student> percentageConsumer =(Student student)-> {
        System.out.println(student.getName() + " : " + student.getPercentage());
    };
    for (Student student :listOfStudent) {
        percentageConsumer.accept(student);
    }


    }
    }

