package Ifelse;

public class ifelse {
}

class FlowControlTest {

    public static void main(String[] args) {
        int a = 100;
        if(a < 100){
            System.out.println("Hurry");
        } else{
            System.out.println("Not happy");
        }

        int noOfSeats = 250;
        int noOfSeatsWon = 184;
        int majorityMark = 185;
        int noOfMinSeatsRequiredToClaimGovFormation = 120;

        if(noOfSeatsWon >= majorityMark){
            System.out.println("Victory.");
        } else if(noOfSeatsWon  <= noOfMinSeatsRequiredToClaimGovFormation){
            System.out.println("Defeat");
        } else {
            System.out.println("No one is having clear majority");
        }


        //fail -> percentage < 35
        //pass -> percentage > 35
        //first class -> percentage > 60
        //Distinction  -> percentage > 75

        double percentage = 35;
        if(percentage < 35){
            System.out.println("You have failed in exam");
        } else if(percentage >= 35 && percentage < 60){
            System.out.println("You have passed the exam");
        } else if(percentage > 60 && percentage < 75){
            System.out.println("First class");
        } else{
            System.out.println("Distinction");
        }


    }
}