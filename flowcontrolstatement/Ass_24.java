package flowcontrolstatement;
//
//24. If his basic salary is less than Rs. 1500, then HRA = 10% of basic salary
      //  and DA = 90% of basic salary. If his salary is either equal to or above
     //   Rs. 1500, then HRA = Rs. 500 and DA = 98% of basic salary.
        //If the employee's salary is input through the keyboard write a program to find his gross salary

   // package control_statement;

public class Ass_24 {
    public static void main(String[] args) {


        double Basic_Salary = 1600;
        double HRA;
        double DA;
        if (Basic_Salary <= 1500) {
            HRA = ((Basic_Salary * 10) / 100);//130
            DA = ((Basic_Salary * 90) / 100);//1170
            System.out.println("gross salary:" + (Basic_Salary+ HRA + DA));//1300+130+1170=2600

        } else if(Basic_Salary>=1500) {
            HRA = ((Basic_Salary + 500));
            DA = ((Basic_Salary * 98) / 100);
            System.out.println("gross salary2:" + (HRA + DA));

        }
    }
}