import java.util.Scanner;

public class Charculator
{
	public static void main(String[] args) {
		
	    Scanner stdin = new Scanner(System.in);
	    System.out.print("Enter First Number or 0 to exit:");
	    double firstNum = stdin.nextDouble();
	    while (firstNum != 0) {
	        System.out.print("Enter +,/,*,-:");
	        char evaluator = stdin.next().charAt(0);
	        System.out.print("Enter Second Number:");
	        double secondNum = stdin.nextDouble();
	        double sum = 0; 
	        switch (evaluator) {
	            case '+':
	                sum = firstNum + secondNum;
	                break;
	            case '-':
	                sum = firstNum - secondNum;
	                break;     
	            case '*':
	                sum = firstNum * secondNum;
	                break;
	            case '/':
	                sum = firstNum / secondNum;
	                break;     
	        }
	        System.out.println(sum + "0");
	        System.out.print("Enter First Number or 0 to exit:");
	        firstNum = stdin.nextDouble();
	    }
	   
		System.out.println("Thank you for using the Charcalator");
	}
}


/*Your program should read an expression, print its value, read
another expression, print its value, and so on. The program should end when the user
enters 0 as the first number on the line.
*/
