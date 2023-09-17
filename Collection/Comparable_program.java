package Collection;

import java.util.ArrayList;
import java.util.List;

public class Comparable_program implements Comparable<Comparable_program>{

    private int rollNum;
    private String stdName;
    private String middleName;
    private  String lastName;
    private int pincode;
    private  String city;
    private String state;

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Comparable_program{" +
                "rollNum=" + rollNum +
                ", StdName='" + stdName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pincode='" + pincode + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
    @Override
    public int compareTo(Comparable_program  o) {
        return this.pincode-o.pincode;
    }

    public Comparable_program(int rollNum, String stdName, String middleName, String lastName, int pincode, String city, String state) {
        this.rollNum = rollNum;
        this.stdName = stdName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.pincode = pincode;
        this.city = city;
        this.state = state;
    }
    Comparable_program(){}

    public static void main(String[] args) {
        Comparable_program std1=new Comparable_program(01,"Vijay","Maroti","kadpewad",431807,"Nanded","Maharastra");
       Comparable_program std2=new Comparable_program(02,"Saurabh","Shankarrao","patil",431512,"latur","Punjab");
       Comparable_program std3=new Comparable_program(03,"Akash","Umakant","Birajdar",430007,"Dhule","Kerala");
        Comparable_program std4=new Comparable_program(02,"Mahesh","Lakshman","Jadhav",432512,"pune","Uttarpradesh");
        Comparable_program std5=new Comparable_program(03,"Shubham","Ramesh","Barude",421234,"Parbhani","Bihar");
        Comparable_program std6=new Comparable_program(02,"Mahesh","Lakshman","Jadhav",432512,"pune","Uttarpradesh");
        Comparable_program std7=new Comparable_program(03,"Neha","Ulhas","Borkar",422234,"Talegaon","Andra");


        List<Comparable_program> obj=new ArrayList<>();
        obj.add(std1);
        obj.add(std2);
        obj.add(std3);
        obj.add(std4);
        obj.add(std5);
        obj.add(std6);
        obj.add(std7);

        System.out.println("Pincode is soring"+obj);

    }


}
