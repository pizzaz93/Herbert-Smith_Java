import java.util.Scanner;

public class Nayme
{
	public static void main(String[] args) {
	    Scanner stdin = new Scanner( System.in );
	    System.out.print("Please enter your first name and last name, separated by a space");
	    String input = stdin.nextLine();
	    int space = input.indexOf(" ");
	    String firstName = input.substring(0,space) ;
	    String lastName = input.substring(space + 1) ;
	  
	   
		System.out.println("Your first name is "+ firstName + " which has " + firstName.length() + " characters");
		System.out.println("Your last name is "+ lastName + " which has " + lastName.length() + " characters");
		System.out.println("Your initals are " + firstName.substring(0,1) + lastName.substring(0,1));
	}
}

/* Please enter your first name and last name, separated by a space.
 Mary Smith
Your first name is Mary, which has 4 characters
Your last name is Smith, which has 5 characters
Your initials are MS
*/


