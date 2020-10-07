/*
Write a function that
performs the experiment of rolling to get a given total 10000 times. The desired total is

a parameter to the subroutine. The average number of rolls is the return value.  
Now, write a main program that will call your function once for each of the possible totals
(2, 3, ..., 12).
 * */

public class DiceStudy {
    
    public static void main(String[] args) {
        double total = 0;
        int counter = 0; 
        double[] results = new double[11];
        for (int i = 2; i < 13; i++) {
            for (int j = 0; j < 10000; j++) {
                int result = rolly(i);
                total = result + total;
            }
            
            double avg = total/10000;
            results[counter] = avg;
            counter++;
        }
        
        System.out.println("The average rolls of the dice it takes to get these numbers ( when rolled 10000 times:");
        System.out.println("Total On Dice      Average Number of Rolls");
        System.out.println("-------------       -----------------------");
        counter = 0;
        for (int k = 2; k < 13; k++) {
            System.out.println("   " + k + "                     "  + results[counter]);
            counter++;
        }

    }

    public static int rolly (int desiredNumber) {
        if (desiredNumber != 2 && desiredNumber != 3 && desiredNumber != 4 && desiredNumber != 5 && desiredNumber != 6 && desiredNumber !=7 &&
                desiredNumber != 8 && desiredNumber != 9 && desiredNumber != 10 && desiredNumber != 11 && desiredNumber != 12) {
                    throw new IllegalArgumentException("Desired number must be possible to get from the dice.");
                }
        int result = 0;
        int numberOfRolls = 0;
        while (result != desiredNumber) {
        int firstDie = (int)(Math.random()*6) + 1;
        int secondDie = (int)(Math.random()*6) + 1;
        result = firstDie + secondDie;
        numberOfRolls +=1;
        }
        
         return numberOfRolls;
    }
}
