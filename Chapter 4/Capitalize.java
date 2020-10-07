import java.util.Scanner;
import java.util.Arrays;

public class Capitalize {
	public static void main(String[] args) {
	    
	Scanner keyboard = new Scanner (System.in);

        System.out.print
        ("Please enter a complete sentence of your choosing: ");

        String input = keyboard.nextLine();
        
        printCapitalized(input);
        
	}
	
	public static void printCapitalized(String sentence) {
	    
        
        String[] word = sentence.split("\\s");
        
        String[] improvedSentence = new String[word.length];

        char a;
        
        String b;
        
        for (int i = 0; i < word.length; i++) {
           a = Character.toUpperCase(word[i].charAt(0));
           b = (a + word[i].substring(1));
           improvedSentence[i] = b ;
        }
        
        
        String capitalizedSentence = Arrays.toString(improvedSentence);
        capitalizedSentence = capitalizedSentence.replaceAll(",", "" ).replaceAll("\\[","").replaceAll("\\]","");
        
 
	   System.out.println(capitalizedSentence);
	}
	
}

/*
To “capitalize” a string means to change the first letter of each word in the string to upper (solution)
case (if it is not already upper case). For example, a capitalized version of “Now is the time
to act!” is “Now Is The Time To Act!”. Write a subroutine named printCapitalized
that will print a capitalized version of a string to standard output. The string to be printed
should be a parameter to the subroutine. Test your subroutine with a main() routine that
gets a line of input from the user and applies the subroutine to it.
*/
