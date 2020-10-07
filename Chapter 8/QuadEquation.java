import java.util.Scanner;

/*
Your program should allow the user to specify values for A, B, and C. It should call the
subroutine to compute a solution of the equation. If no error occurs, it should print the
root. However, if an error occurs, your program should catch that error and print an error
message. After processing one equation, the program should ask whether the user wants
to enter another equation. The program should continue until the user answers no.
 * */
public class QuadEquation {
     
    public static void main(String[] args) {
        System.out.println("This returns the larger of the two roots of the quadratic equation"); 
        System.out.println("A*x*x + B*x + C = 0, provided it has any roots.");
        System.out.println("Enter three spaced values for a b and c:");
        
        Scanner quadWriter = new Scanner(System.in);
        String end = "";
        while (!end.equals("no")) {
            String line = quadWriter.nextLine();
            String[] lineBits = line.split(" ");
            if (line.equals("no")) {
                end = line;
            }
            else {
                double A = Double.parseDouble(lineBits[0]);
                double B = Double.parseDouble(lineBits[1]);
                double C = Double.parseDouble(lineBits[2]);
                double result = root(A,B,C);
                System.out.println(result);
            }
            System.out.println("want to stop? enter no and hit enter");
        }
        quadWriter.close();
     }
    
    static public double root( double A, double B, double C )
            throws IllegalArgumentException {
                if (A == 0) {
                    throw new IllegalArgumentException("A can’t be zero.");
                }
                else {
                    double disc = B*B - 4*A*C;
                    if (disc < 0) {
                        throw new IllegalArgumentException("Discriminant < zero.");
                    }
                return (-B + Math.sqrt(disc)) / (2*A);
            
                }
            }
    
}   
