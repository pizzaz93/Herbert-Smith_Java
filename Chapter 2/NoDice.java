public class NoDice
{
	public static void main(String[] args) {
	    int firstRoll = (int)(Math.random()*6) + 1;
	    int secondRoll = (int)(Math.random()*6) + 1;
	    int sum = firstRoll + secondRoll;;
	    
	    
		System.out.println("The first die comes up " + firstRoll);
		System.out.println("The second die comes up " + secondRoll);
		System.out.println("Your total roll is " + sum);
	}
}
/*Write a program that simulates rolling a pair of dice. You can simulate rolling one die by (solution)
choosing one of the integers 1, 2, 3, 4, 5, or 6 at random. Your program should report the number
showing on each die as well as the total roll.*/
