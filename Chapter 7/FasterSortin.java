import java.util.Arrays;

/*
The standard sorting method Arrays.sort() is 
much faster and efficient than selection sort. Write a program to test this claim. To be specific,
your program should create a large array filled with random real numbers. It should
use both Arrays.sort() and selectionSort() to sort the array, and it should time how
long it takes to perform each sort. Furthermore, it should do the same thing for a large
array of random Strings.
 * */
public class FasterSortin {
     
    public static void main(String[] args) {
        long startTime; // Starting time of program, in milliseconds.
        long endTime; // Time when computations are done, in milliseconds.
        double time; // Time difference, in seconds.
        startTime = System.currentTimeMillis();
        
        int num = 0;
        int[] starter = new int[30];
        for (int i = 0; i < starter.length; i++) {
                num = (int)(Math.random() * 50);
                starter[i] = num;
            }
        int[] starterClone = starter;
        startTime = System.currentTimeMillis();
        selectionSort(starter);
        endTime = System.currentTimeMillis();
        time = (endTime - startTime) / 1000.0;
        double selectionTime = time;
        startTime = System.currentTimeMillis();
        Arrays.sort(starterClone);
        endTime = System.currentTimeMillis();
        time = (endTime - startTime) / 1000.0;
        double arraySortTime = time;
        
        if (arraySortTime < selectionTime) {
            System.out.println("In the Int Array test it was proven that indeed Arrays.sort is faster!");
        }
        else {
            System.out.println("In the Int Array test Arrays.sort was slower then selection sort!!!");
        }
        String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder builder = new StringBuilder();
        String[] stingArray = new String[30];
        for (int s = 0; s < stingArray.length; s++) {
          for(int w = 0; w < 5; w++) {
               int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
               builder.append(ALPHA_NUMERIC_STRING.charAt(character));
          }
          stingArray[s] = builder.toString();
        }
        String[] stingClone = stingArray;
        startTime = System.currentTimeMillis();
        selectionSortString(stingArray);
        endTime = System.currentTimeMillis();
        time = (endTime - startTime) / 1000.0;
        selectionTime = time;
        startTime = System.currentTimeMillis();
        Arrays.sort(stingClone);
        endTime = System.currentTimeMillis();
        time = (endTime - startTime) / 1000.0;
        arraySortTime = time;
        
        if (arraySortTime < selectionTime) {
            System.out.println("In the String Array test it was proven that indeed Arrays.sort is faster!");
        }
        else {
        System.out.println("In the String Array test Arrays.sort was slower then selection sort!!!");
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
    
    static void selectionSortString(String[] A) {
        // Sort A into increasing order, using selection sort
        for (int lastPlace = A.length-1; lastPlace > 0; lastPlace--) {
        // Find the largest item among A[0], A[1], ...,
        // A[lastPlace], and move it into position lastPlace
        // by swapping it with the number that is currently
        // in position lastPlace.
            int maxLoc = 0; // Location of largest item seen so far.
            for (int j = 1; j <= lastPlace; j++) {
                if (A[j].compareTo(A[maxLoc]) > 0) {
                    // Since A[j] is bigger than the maximum we’ve seen
                    // so far, j is the new location of the maximum value
                    // we’ve seen so far.
                    maxLoc = j;
                }
            }
            String temp = A[maxLoc]; // Swap largest item with A[lastPlace].
            A[maxLoc] = A[lastPlace];
            A[lastPlace] = temp;
        } // end of for loop
     }
}   
