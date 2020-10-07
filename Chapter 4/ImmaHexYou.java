import java.util.Scanner;
import java.lang.Math;

public class ImmaHexYou {

	public static void main(String[] args) {
	    
	Scanner keyboard = new Scanner (System.in);
        boolean validInput = false;
       
        while (!validInput) {
            System.out.println("Please enter a hexadecimal number of your choosing: ");
            String input = keyboard.nextLine();
           
            if (input.matches("[^A-Fa-f_0-9]+")) {
                System.out.println("The number you entered contains an invalid character");
                continue;
            }

            double value = 0;
            double totalValue = 0;
            double hexConstant = 0;
            double power = input.length();
            power--; // to fit the right formula of 16 to the power of decreasing to 0
            for (int i = 0; i < input.length(); i++) {
                int inputCharacter = hexValue(input.charAt(i));
                if  (inputCharacter == -1) {
                    inputCharacter = input.charAt(i);
                }
                
                hexConstant = Math.pow(16,power);
                value = hexConstant * inputCharacter;
                totalValue += value;
                power--;
	        }
	    
            System.out.println(totalValue);
            validInput = true;
        }
	}
	
	 public static int hexValue(char hexCharacter) {
	        switch(hexCharacter) {
	           case 'a': 
	           case 'A':
	            return 10;  
	           case 'b':
	           case'B':
	            return 11;  
	           case 'c': 
	           case'C':
	            return 12;  
	           case 'd':
	               
	           case'D':
	            return 13;  
	           case 'e': 
	           case'E':
	            return 14; 
	           case 'f':
	           case 'F':
	            return 15;  
	           default:
	            return -1; 
	        }
	    }
}
/*
Transforms a hexadecimal number to base-10 decimal.
*/
