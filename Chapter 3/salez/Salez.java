
import java.io.File;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Salez { 
    private static DecimalFormat pretty = new DecimalFormat(".##");
	  public static void main(String[] args) throws Exception {
	      File file = new File("sales.dat");
	    
        Scanner sc = new Scanner(file);
        double total  = 0;
        int counter = 0;

        while(sc.hasNextLine()) {
	        
            String lineItem = sc.nextLine();
            int colon = lineItem.indexOf(":");    	     	  

            String salesData = lineItem.substring(colon + 1);
            try {
                double salesNumber = Double.parseDouble(salesData);
                total = total + salesNumber;
            }

            catch(NumberFormatException nfe){ 

                counter++;
            }     
	      }
	    
		    System.out.println("The Sales Total is: "+  pretty.format(total) + " ! The number of cities with no revenue is: " + counter);
	  }
}

/*
Suppose that a file contains information about sales figures for a company in various cities. (solution)
Each line of the file contains a city name, followed by a colon (:) followed by the data for
that city. The data is a number of type double. However, for some cities, no data was
available. In these lines, the data is replaced by a comment explaining why the data is
missing. For example, several lines from the file might look like:
San Francisco: 19887.32
Chicago: no report received
New York: 298734.12
Write a program that will compute and print the total sales from all the cities together.
The program should also report the number of cities for which data was not available.
The name of the file is “sales.dat”.
To complete this program, you’ll need one fact about file
*/
