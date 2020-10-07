import java.util.Scanner;

/*A class of Roman Numerals constructors and a main method that uses the class to tranlsate roman to regular digits and regular digits
 * to Roman Numerals
 * */
public class RoaminData {
    public static void main(String[] args) {
        RoaminData roaminData = new RoaminData();
        Scanner scribe = new Scanner(System.in);
        System.out.println("This program Translate regular numbers to roman and vice versa. enter the roman numerals spaced like M C X "); 
        String line = "";
        while (!line.equals("   ")) { 
             line = scribe.nextLine();
             boolean romanLetter = false;
             if (Character.isLetter(line.charAt(0))) {
                 romanLetter = true;
             }
             if (romanLetter) {
               String regularDigit = line;  
               RomanNumeral roaminNumeral = roaminData.new RomanNumeral(regularDigit);
               System.out.println("The regular number is: " + roaminNumeral.value);
             }
             else {
                 int number = Integer.parseInt(line);
                 RomanNumeral roaminNumeral = roaminData.new RomanNumeral(number);
                 System.out.println("The Roman Numerals are " + roaminNumeral.numeral);
             }
            System.out.println("enter another number to do it again or an empty line to terminate");  
        }
         scribe.close();
     }
    
     public class RomanNumeral{
         int value;
         String numeral;
         public  RomanNumeral(String roman)  throws NumberFormatException {
             int regularNumber = 0;
             String[] letters = roman.split(" ");
             for (int i = 0; i < letters.length; i++){
                 String letter = letters[i];
                 int nextLetter = i + 1;
                 String next = "R";
                 int close = letters.length - 1;
                 if (i != letters.length && i != close) {
                     next = letters[nextLetter];
                 }
                 if (!letter.equals("M") && !letter.equals("C") && !letter.equals("D") && !letter.equals("X") && !letter.equals("V") && !letter.equals("I")) {
                     throw new NumberFormatException("The Letters entered are not roman numerals");
                 }
                 switch(letter) {
                 case "M":
                     regularNumber += 1000;
                     break;
                 case "C":
                     if (next.equals("M")) {
                         regularNumber = regularNumber -  100;
                         break;
                     }
                     if (next.equals("D")) {
                         regularNumber = regularNumber - 100;
                         break;
                     }
                     regularNumber += 100;
                     break;
                 case "D":
                     regularNumber += 500;
                     break;    
                 case "X":
                     if (next.equals("C")) {
                         regularNumber = regularNumber - 10;
                         break;
                     }
                     regularNumber += 10;
                     break;
                 case "V":
                     regularNumber += 5;
                     break;
                     
                 case "I":
                     if (next.equals("X")) {
                         regularNumber = regularNumber - 1;
                         break;
                     }
                     
                     if (next.equals("V")) {
                         regularNumber = regularNumber - 1;
                         break;
                     }
                      regularNumber += 1;
                      break;
                 
                 }
                 value = regularNumber;
                 
             }
         }      
                 
                 public  RomanNumeral(int number)  throws NumberFormatException{
                     if (number < 1 || number > 3999) {
                         throw new NumberFormatException("The number is outside the range of 1 to 3999.");
                     }
                     String roman = "";
                     int N = number;
                     while (N >= 1000) {
                     roman += "M";
                     N -= 1000;
                     }
                     while (N >= 900) {
                     roman += "CM";
                     N -= 900;
                     }
                     while (N >= 500) {
                         roman += "D";
                         N -= 500;
                     }
                     while (N >= 400) {
                         roman += "CD";
                         N -= 400;
                     }
                     while (N >= 100) {
                         roman += "C";
                         N -= 100;
                     }
                     while (N >= 900) {
                     roman += "XC";
                     N -= 90;
                     }
                     while (N >= 50) {
                         roman += "L";
                         N -= 50;
                     }
                     while (N >= 40) {
                         roman += "XL";
                         N -= 40;
                     }
                     while (N >= 10) {
                         roman += "X";
                         N -= 10;
                     }
                     while (N >= 9) {
                     roman += "IX";
                     N -= 9;
                     }
                     while (N >= 5) {
                         roman += "V";
                         N -= 5;
                     }
                     while (N >= 4) {
                         roman += "IV";
                         N -= 4;
                     }
                     while (N >= 1) {
                         roman += "I";
                         N -= 1;
                     }
                     
                     numeral = roman;
                 }
                 
                 public String toString(RomanNumeral romanNum) {
                     String stringVersion = romanNum.toString(romanNum);
                     return stringVersion;
                 }
                 
                 public int toInt(RomanNumeral roman) {
                     int intVersion = roman.toInt(roman);
                     return intVersion;
                 }
              
         }
}   
