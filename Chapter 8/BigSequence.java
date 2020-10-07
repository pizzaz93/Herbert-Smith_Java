import java.util.Scanner;
import java.math.BigInteger;

/*The 3n + 1 Sequence
 The rule for creating the sequence is to start from some positive integer,
  call it n, and to generate the next term of the sequence from n, either by halving n,
  whenever n is even, or else by multiplying it by three and adding 1 when it is odd. The sequence terminates when n reaches 1.
 * */
public class BigSequence {
     
    public static void main(String[] args) {
        System.out.println("This program executes the 3n+1 sequence enter a number to start and an empty line to terminate"); 
       
        threeSequence();
       
     }
    
    static public void threeSequence() throws NumberFormatException {
        String line = "start";
        while (!line.equals("   ")) { 
             Scanner quadWriter = new Scanner(System.in);
             line = quadWriter.nextLine();
             quadWriter.close();
             boolean x = false;
             for (int i = 0; i < line.length(); i++) {
                if (Character.isLetter(line.charAt(i))) {
                    x = true;
                }
             }
             BigInteger starter = new BigInteger(line);
             BigInteger add = new BigInteger("1");
             BigInteger divisor = new BigInteger("2");
             BigInteger multiplier = new BigInteger("3");
             
             BigInteger newSum = new BigInteger("0");
             BigInteger divided = new BigInteger("0");
             boolean odd = false;
             if (starter.equals("0")) {
                 System.out.println("The starting value needs to be greater than 0");
                 break;
             }
             if (x) { //  if starter contains any letters then throw this 
                 throw new NumberFormatException("is not a valid representation of a BigInteger.");
             }
             while (starter.signum() != 0 && !starter.equals(add)) {
                 odd = starter.testBit(0);
                 if (odd) {
                     newSum = starter.multiply(multiplier);
                     newSum.add(add);
                     starter = newSum;
                     System.out.println(starter);
                 } else {
                       divided = starter.divide(divisor);
                       starter = divided;
                       System.out.println(starter);
                 }
             }
             System.out.println("enter another number to do it again or an empty line to terminate");
        }
        
    }
    
}   
