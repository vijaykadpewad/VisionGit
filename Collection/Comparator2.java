package Collection;

import java.util.ArrayList;
import java.util.List;

public class Comparator2 {
    private int stdRollNum;
    private String stdName;
    private String stdlast;

    public Comparator2(int stdRollNum, String stdName, String stdlast) {
        this.stdRollNum = stdRollNum;
        this.stdName = stdName;
        this.stdlast = stdlast;
    }

    public int getStdRollNum() {
        return stdRollNum;
    }

    public void setStdRollNum(int stdRollNum) {
        this.stdRollNum = stdRollNum;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdlast() {
        return stdlast;
    }

    public void setStdlast(String stdlast) {
        this.stdlast = stdlast;
    }

    @Override
    public String toString() {
        return "Comparator2{" +
                "stdRollNum=" + stdRollNum +
                ", stdName='" + stdName + '\'' +
                ", stdlast='" + stdlast + '\'' +
                '}';
    }

    public static void main(String[] args) {
Comparator2 com=new Comparator2(01,"vijay","kadpewad");
Comparator2 com1=new Comparator2(02,"Angad","Vaidhya");
Comparator2 com2=new Comparator2(03,"parth","kadpewad");
        List<Comparator2> obj=new ArrayList<>();
        obj.add(com);
        obj.add(com1);
        obj.add(com2);






    }
}