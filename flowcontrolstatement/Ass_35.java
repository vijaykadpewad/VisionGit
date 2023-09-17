package flowcontrolstatement;

//35. In a company, worker efficiency is determined on the basis of the time required
//        for a worker to complete a particular job. If the time taken by the worker is between
//        2 – 3 hours, then the worker is said to be highly efficient. If the time required by the worker
//        is between 3 – 4 hours, then the worker is ordered to improve speed. If the time taken is
//        between 4 – 5 hours, the worker is given training to improve his speed, and if the time taken
//        by the worker is more than 5 hours, then the worker has to leave the company. If the time taken
//        by the worker is input through the keyboard, find the efficiency of the worker



public class Ass_35 {
    public static void main(String[] args) {
        float time=2.5f;

        if (time>=2&&time<3){
            System.out.println("the worker is said to be highly efficient.");

        }
      else  if (3<=time&&time<4){
            System.out.println("the worker is ordered to improve speed.");

        }
        else  if (4<=time&&time<=5){
            System.out.println("the worker is given training to improve his speed,");
    }
        else  if (time>=5) {
            System.out.println("the worker has to leave the company.");
        }}}