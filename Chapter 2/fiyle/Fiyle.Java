import java.io.File;
import java.util.Scanner;

public class Fiyle
{
	public static void main(String[] args) throws Exception {
	    File file = new File("testdata.txt");
	    
	    Scanner sc = new Scanner(file);
	    
	    String name = sc.nextLine();
	    String scoreOne = sc.nextLine();
	    String scoreTwo = sc.nextLine();
	    String scoreThree = sc.nextLine();
	    int testOne = Integer.parseInt(scoreOne);
	    int testTwo = Integer.parseInt(scoreTwo);
	    int testThree = Integer.parseInt(scoreThree);
	    int average = (testOne + testTwo + testThree) / 3;
	   

	   
		System.out.println("Hey "+ name + " your average score is " + average);
	}
}

/* Suppose that a file named “testdata.txt” contains the following information: The first (solution)
line of the file is the name of a student. Each of the next three lines contains an integer.
The integers are the student’s scores on three exams. Write a program that will read
the information in the file and display (on standard output) a message that contains the
name of the student and the student’s average grade on the three exams
*/
