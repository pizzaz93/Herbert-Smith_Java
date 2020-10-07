/******************************************************************************
Write a function that simulates rolling a pair of dice until the total on the dice comes up (solution)
to be a given number. The number that you are rolling for is a parameter to the function.
The number of times you have to roll the dice is the return value of the function. The
parameter should be one of the possible totals: 2, 3, . . . , 12.

The function should throw
an IllegalArgumentException if this is not the case. Use your function in a program that
computes and prints the number of rolls it takes to get snake eyes. (Snake eyes means
that the total showing on the dice is 2.)

*******************************************************************************/

public class rollMyWish {
	public static void main(String[] args) {
		
		int result = rolly(2);
		System.out.println("Total times it take to roll Snake Eyes " + result);

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



