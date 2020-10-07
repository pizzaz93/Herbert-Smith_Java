/*
Suppose that M is a two-dimensional array that has R rows and C columns. The transpose of
 M is defined to be an array T that has C rows and R columns such that
T[i][j] = M[j][i] for each i and j. Write a function that takes an array of type int[ ][ ]
as a parameter, and returns the transpose of that array. (Assume that the parameter is a
typical 2D array in which all the rows have the same length.) Also write a subroutine to
print a 2D array of integers in neat rows and columns, and include a main() routine to
test your work.
 * */
public class TransposeThis {
     
    public static void main(String[] args) {
   
        TransposeThis transposeThis = new TransposeThis();
        int num = 0;
        int[][] starter = new int[3][3];
        for (int i = 0; i < starter.length; i++) {
            for (int j = 0; j < starter[i].length; j++) {
                num = (int)(Math.random() * 50);
                starter[i][j] = num;
            }
        }
        transposeThis.prettyPrint(starter);
        int [][] ready = transposeThis.transposeTime(starter);
        transposeThis.prettyPrint(ready);
     }
     
     
    
    public int[][] transposeTime(int[][] starter ) {   
        int rowLength = starter.length;
        int columnLength = starter[0].length;
        int[][] ready = new int[columnLength][rowLength];
        for(int row = 0 ; row < starter.length; row++) {
            for (int column = 0; column < starter[row].length; column++) {
                ready[row][column] = starter[column][row]; 
            }
        
        }
        return ready;
    }
    
    public void prettyPrint(int[][] ready) {
        for (int row = 0 ; row < ready.length; row++) {
            System.out.println(" ");
            System.out.println(" ");
            for(int column = 0; column<ready[row].length; column++) {
               System.out.print(ready[row][column]);
               System.out.print("    ");
            }
            System.out.println(" ");
            System.out.println("__________");
        } 
        System.out.println(" ");
        System.out.println("__________");
        System.out.println("__________");
        System.out.println("__________");
    }
    
}   

