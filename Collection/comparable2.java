package Collection;

import org.jetbrains.annotations.NotNull;

public class comparable2 {
    String FN;
    String SM;
    String LN;
    int roll;
    double number;
    String address;

    @Override
    public String toString() {
        return "comparable2{" +
                "FN='" + FN + '\'' +
                ", SM='" + SM + '\'' +
                ", LN='" + LN + '\'' +
                ", roll=" + roll +
                ", number=" + number +
                ", address='" + address + '\'' +
                '}';
    }

    public comparable2(String FN, String SM, String LN, int roll, double number, String address) {
        this.FN = FN;
        this.SM = SM;
        this.LN = LN;
        this.roll = roll;
        this.number = number;
        this.address = address;
    }

    comparable2(){

    }

    public String getFN() {
        return FN;
    }

    public void setFN(String FN) {
        this.FN = FN;
    }

    public String getSM() {
        return SM;
    }

    public void setSM(String SM) {
        this.SM = SM;
    }

    public String getLN() {
        return LN;
    }

    public void setLN(String LN) {
        this.LN = LN;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        comparable2 s=new comparable2("sham","devesh","thakur",11,3434365465465d,"nanded");
comparable2 s1=new comparable2("vijay","maroti","kadpewad",12,8208880253d,"parbhani");

    }



  /*  @Override
    public int compareTo(this.FN. comparable2 o.FN) {
        return 0;
    }*/
}
