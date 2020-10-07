
/*
Write a pair of dice class
in which the instance variables die1 and die2 are private. Your class will need “getter”
methods that can be used to find out the values of die1 and die2. (The idea is to protect
their values from being changed from outside the class, but still to allow the values to be
read.) 
Test your class with a short program that counts how many times a pair of dice is rolled,
before the total of the two dice is equal to two.
 * */

public class PrivateDice {
     
    public static void main(String[] args) {
        PrivateDice dize = new PrivateDice();
        PairOfDice pair = dize.new PairOfDice();
        int result = pair.rolly(2);
        System.out.println("Total times it take to roll Snake Eyes " + result);
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

