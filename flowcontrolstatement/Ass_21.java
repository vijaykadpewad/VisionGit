package flowcontrolstatement;
//21. Write a program to input electricity unit charges and calculate total electricity bill according to the given condition:
//
//For first 50 units Rs. 0.50/unit
//For next 150 units Rs. 0.75/unit
//For next 250 units Rs. 1.20/unit
//For unit above 250 Rs. 1.50/unit
//An additional surcharge of 20% is added to the bill
public class Ass_21 {
    public static void main(String[] args) {
        int units = 155;
        double result;
        if(units<=50){
           result= 0.5*units;
            double subcharge =(result*20)/100;
            System.out.println("for first 50 units charge"+(result+(subcharge)));
        } else if (units<=150){
            double result1=0.75*units;
            double subcharge=(result1*20)/100;
            System.out.println("for next 150 units charge"+(result1+(subcharge)));

            } else if (units<=250) {
            double result2=1.20*units;
            double subcharge=(result2*20)/100;
            System.out.println("for next  250 units charge"+(result2+(subcharge)));
        }
        else{
            double result3=units*1.5;
            double subcharge=(result3*20)/100;
            System.out.println("for above units charge"+(result3+(subcharge)));
        }

    }
    }
