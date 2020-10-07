public class Mayth {
	public static void main(String[] args) {
		int temp = 0;
		int tempDivisors = 0;
		int divisors = 0;
		int number = 0;
		
		for (int i = 1 ; i <= 10000; i++){
			tempDivisors = 0;
		    for (int j = 1 ; j <= 10000; j++){
		        if (i % j == 0){
		            temp = i;
		            tempDivisors +=1;
		        }
    		    if(tempDivisors > divisors) {
    		       number = temp;
    		       divisors = tempDivisors;
		        }
		    }  
		}

	    
		System.out.println("This Number " + number + " has the most divisors at " + divisors);

	}
}

//Which integer between 1 and 10000 has the largest number of divisors, and how many divisors does it have?
