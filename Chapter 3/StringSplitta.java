import java.util.Scanner;

public class StringSplitta {

    public static void main (String[]args) {

        Scanner stdin = new Scanner (System.in);

        System.out.print
        ("Please enter a complete sentence of your choosing: ");

        String input = stdin.nextLine();
        String cleanString = input.replaceAll("[^\\w\\s]","");
        String[] word = cleanString.split("\\s");
            for (int i = 0; i < word.length; i++) {
                System.out.println(word[i]);
        
            }
    }
}


/* 
Write a program that reads one line of input text and breaks it up into words. The (solution)
words should be output one per line. A word is defined to be a sequence of letters. Any
characters in the input that are not letters should be discarded.
*/

