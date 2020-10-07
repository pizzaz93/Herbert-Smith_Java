/*
Use a
PairOfDice object to represent the dice. Use a StatCalc object to compute the statistics.
 * */

public class DiceStats {
    
    public static void main(String[] args) {
        DiceStats dyce = new DiceStats();
        PairOfDice pair = dyce.new PairOfDice();
        
        double result = 0;
      
        for (int i = 2; i < 13; i++) {
            StatCalc stats = dyce.new StatCalc();
            for (int j = 0; j < 10000; j++) {
                result = pair.rolly(i);
                stats.enter(result);
            }
            int count = stats.getCount();
            double deviation = stats.getStandardDeviation();
            double sum = stats.getSum();
            double mean = stats.getMean();
            double max = stats.getMax();
            double min = stats.getMin();
            System.out.println("Here are your Statistics for the number:" + i);
            System.out.println("The count of this set is: " + count);
            System.out.println("The standard deviation of this set is: " + deviation);
            System.out.println("The sum of this set is: " + sum);
            System.out.println("The mean of this set is: " + mean);
            System.out.println("The max of this set is: " + max);
            System.out.println("The min of this set is: " + min);
        }
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
    
    public class PairOfDice { 
        private int die1 = 3; // Number showing on the first die.
        private int die2 = 4; // Number showing on the second die.
        
        // Roll the dice by setting each of the dice to be
        public void roll() {// a random number between 1 and 6.
            int dieOne = (int)(Math.random()*6) + 1;
            setDieOne(dieOne);
            int dieTwo = (int)(Math.random()*6) + 1;
            setDieTwo(dieTwo);
        }
        public int rolly (int desiredNumber) {
            if (desiredNumber != 2 && desiredNumber != 3 && desiredNumber != 4 && desiredNumber != 5 && desiredNumber != 6 && desiredNumber !=7 &&
            desiredNumber != 8 && desiredNumber != 9 && desiredNumber != 10 && desiredNumber != 11 && desiredNumber != 12) {
                throw new IllegalArgumentException("Desired number must be possible to get from the dice.");
            }
            int result = 0;
            int numberOfRolls = 0;
            while (result != desiredNumber) {
            roll();
            result = getDieOne() + getDieTwo();
            numberOfRolls +=1;
            }
            return numberOfRolls;
        }
            
        public int getDieOne() {
            return die1;
        }
        public int getDieTwo() {
            return die2;
        }
        
        public void setDieOne(int die) {
             die1 = die ;
        }
        public void setDieTwo(int die) {
             die2 = die;
        }
    
    }
}
