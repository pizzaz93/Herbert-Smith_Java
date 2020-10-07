import java.util.Scanner;

/*
calc.enter(item) where item is a number, adds the item to the dataset.
• calc.getCount() is a function that returns the number of items that have been
added to the dataset.
• calc.getSum() is a function that returns the sum of all the items that have been
added to the dataset.
• calc.getMean() is a function that returns the average of all the items.
• calc.getStandardDeviation() is a function that returns the standard deviation
of the items.
Typically, all the data are added one after the other by calling the enter() method
over and over, as the data become available. After all the data have been entered, any
of the other methods can be called to get statistical information about the data. 
Modify the current source code, StatCalc.java, to add instance methods getMax() and
getMin(). The getMax() method should return the largest of all the items that have been
added to the dataset, and getMin() should return the smallest. You will need to add two
new instance variables to keep track of the largest and smallest items that have been seen
so far.
Test your new class by using it in a program to compute statistics for a set of non-zero
numbers entered by the user. 
Read numbers from the user and add them to the dataset. Use 0 as a sentinel value
(that is, stop reading numbers when the user enters 0). After all the user’s non-zero
numbers have been entered, print out each of the six statistics that are available from
calc.
 * */


public class MinMaxStat {
    
    public static void main(String[] args) {
        MinMaxStat minnie = new MinMaxStat();
        StatCalc stats = minnie.new StatCalc();
        System.out.println("Enter any string of numbers spaced with the last one being 0");
        System.out.println("Then stand back and watch the stats come forth");
        Scanner statsEnter = new Scanner(System.in);
        int end = 0;
        while (end != 56) {
        double num = statsEnter.nextDouble();
        if (num == 0) {
            end = 56;
            break;
        }
        stats.enter(num);
        }
        statsEnter.close();
        int count = stats.getCount();
        double deviation = stats.getStandardDeviation();
        double sum = stats.getSum();
        double mean = stats.getMean();
        double max = stats.getMax();
        double min = stats.getMin();
        System.out.println("Here are your Statistics");
        System.out.println("The count of this set is: " + count);
        System.out.println("The standard deviation of this set is: " + deviation);
        System.out.println("The sum of this set is: " + sum);
        System.out.println("The mean of this set is: " + mean);
        System.out.println("The max of this set is: " + max);
        System.out.println("The min of this set is: " + min);
    }
    
    public class StatCalc {

        private int count;   // Number of numbers that have been entered.
        private double sum;  // The sum of all the items that have been entered.
        private double squareSum;  // The sum of the squares of all the items.
        private double min;
        private double max;
    
        /**
         * Add a number to the dataset.  The statistics will be computed for all
         * the numbers that have been added to the dataset using this method.
         */
        public void enter(double num) {
            count++;
            sum += num;
            squareSum += num*num;
            min = num;
            if (num > max) {
                max = num;
            }
        }
    
        /**
         * Return the number of items that have been entered into the dataset.
         */
        public int getCount() {
            return count;
        }
    
        /**
         * Return the sum of all the numbers that have been entered.
         */
        public double getSum() {
            return sum;
        }
    
        /**
         * Return the average of all the items that have been entered.
         * The return value is Double.NaN if no numbers have been entered.
         */
        public double getMean() {
            return sum / count;  
        }
    
        /**
         * Return the standard deviation of all the items that have been entered.
         * The return value is Double.NaN if no numbers have been entered.
         */
        public double getStandardDeviation() {  
            double mean = getMean();
            return Math.sqrt( squareSum/count - mean*mean );
        }
        
        public double getMin() {
            return min;
        }
        public double getMax() {
            return max;
        }
    } 
}
