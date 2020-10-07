import java.util.Scanner;

public class Chaynge
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	    Scanner stdin = new Scanner( System.in );
	    System.out.print("How many quarters do you have?");
	    double quarters = stdin.nextDouble() * 25;
	    System.out.print("How many dimes do you have?");
	    double dimes = stdin.nextDouble() * 10 ;
	    System.out.print("How many nickels do you have?");
	    double nickels = stdin.nextDouble() * 5;
	    System.out.print("How many pennies do you have?");
	    double pennies = stdin.nextDouble();
	    
	    double sum = (pennies + nickels + dimes + quarters) * 0.01;
	   
		System.out.println("You have $" + sum + " :)");
	}
}

/* The program should ask how many (solution)
quarters the user has, then how many dimes, then how many nickels, then how many
pennies. Then the program should tell the user how much money he has, expressed in
dollars.
*/

