import java.util.Scanner;

public class Ayygs
{
	public static void main(String[] args) {
	    Scanner stdin = new Scanner( System.in );
	    System.out.print("How many eggs do you have?");
	    int eggs = stdin.nextInt();
	    int gross = eggs / 144;
	    int dozen = (eggs % 144) / 12;
	    int remainder = (eggs % 144) % 12;
	   
		System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + remainder + ".");
	}
}

/* Write a program that asks
the user how many eggs she has and then tells the user how many dozen eggs she has and
how many extra eggs are left over.
A gross of eggs is equal to 144 eggs. Extend your program so that it will tell the user
how many gross, how many dozen, and how many left over eggs she has. For example, if
the user says that she has 1342 eggs, then your program would respond with
Your number of eggs is 9 gross, 3 dozen, and 10
since 1342 is equal to 9*144 + 3*12 + 10.
*/
