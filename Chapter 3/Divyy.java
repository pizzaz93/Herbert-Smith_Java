
public class Divyy { 
	
	public static void main(String[] args) {
	
		int tempDivisors = 0;
		int divisors = 0;
		int[] result = new int[10001];
		
		for (int i = 1 ; i <= 10000; i++){
		    tempDivisors = 0;
		    for (int j = 1 ; j <= 10000; j++){
		       
		        if (i % j == 0) {
		           tempDivisors +=1;
		        }
		        
		        if (tempDivisors > divisors) {
		           divisors = tempDivisors;
 		     
		            
		        }
		        if (j == 10000) {
		            result[i] = tempDivisors;
		        }
		    }      
 		        
		}
		
	    System.out.println("Among integers between 1 and 10000,");
	    System.out.println("The maximum number of divisors was " + divisors);
	    System.out.println("Numbers with that many divisors include:");
	    for  (int k = 0; k < result.length; k++) {
		    if (result[k] == divisors) {
		    System.out.println(k);    
		    }
		}
	}
} 
/*
Use an array
as follows: As you count the divisors for each number, store each count in an array. Then
at the end of the program, you can go through the array and print out all the numbers
that have the maximum count. The output from the program should look something like
this:
Among integers between 1 and 10000,
The maximum number of divisors was 64
Numbers with that many divisors include:
7560
9240
*/
