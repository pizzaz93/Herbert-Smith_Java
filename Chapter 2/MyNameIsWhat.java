import java.util.Scanner;
public class MyNameIsWhat
{
	public static void main(String[] args) {
	    Scanner stdin = new Scanner( System.in );
	    System.out.print("Please Enter Your First Name:");
	    String name = stdin.next();
	    name = name.toUpperCase();
		System.out.println("Hello " + name + ", nice to meet you!");
		
	}
}
/* Write a program that asks the users name, and then greets the user by name. Before
outputting the users name, convert it to upper case letters.
*/


