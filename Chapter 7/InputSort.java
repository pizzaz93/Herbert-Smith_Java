
import java.util.Scanner;

/*
Write a program that will read a sequence of positive real numbers entered by the user 
and will print the same numbers in sorted order from smallest to largest. The user will
input a zero to mark the end of the input. Assume that at most 100 positive numbers
will be entered. Do not use any built-in function such as Arrays.sort(). Do the sorting
yourself.
 * */
public class InputSort {
     
    public static void main(String[] args) {
        System.out.println("Enter any string of numbers (no more than 100 numbers) spaced with the last one being 0");
        System.out.println("Then stand back and watch them get sorted from least to greatest");
        int[] sorted = new int[100];
        Scanner toBeSorted = new Scanner(System.in);
        int end = 0;
        int count = 0;
        while (end != 56 && count != 100) {
            int num = toBeSorted.nextInt();
            if (num == 0) {
                end = 56;
                break;
            }
            sorted[count] = num;
            count++;
        }
        toBeSorted.close();
        
        selectionSort(sorted);
        for (int i = 0; i < sorted.length; i++) {
            if(sorted[i] != 0) {
            System.out.println(sorted[i]);
            }
        }
       
     }
     
    static void selectionSort(int[] A) {
     // Sort A into increasing order, using selection sort
         for (int lastPlace = A.length-1; lastPlace > 0; lastPlace--) {
         // Find the largest item among A[0], A[1], ...,
         // A[lastPlace], and move it into position lastPlace
         // by swapping it with the number that is currently
         // in position lastPlace.
             int maxLoc = 0; // Location of largest item seen so far.
             for (int j = 1; j <= lastPlace; j++) {
                 if (A[j] > A[maxLoc]) {
                 // Since A[j] is bigger than the maximum we’ve seen
                 // so far, j is the new location of the maximum value
                 // we’ve seen so far.
                 maxLoc = j;
                 }
             }
             int temp = A[maxLoc]; // Swap largest item with A[lastPlace].
             A[maxLoc] = A[lastPlace];
             A[lastPlace] = temp;
         } // end of for loop
     }
    
 
    
}   

