public class BoithdayTriple {

    public static void main(String[] args) {

        boolean[] used; 
        boolean[] usedAgain;

        int count;       

        used = new boolean[365]; 
        usedAgain = new boolean[365];
        count = 0;
        
        while (true) {
            int birthday;  
            birthday = (int)(Math.random()*365);
            count++;
            if (used[birthday] == true) {
                   break;
                }
            used[birthday] = true;
        }
        
        while (true) {
            int secondBirthday;  
            secondBirthday = (int)(Math.random()*365);
            count++;
            if (usedAgain[secondBirthday] == true) {
                   break;
                }
            usedAgain[secondBirthday] = true;
        }
        System.out.println("A triplicate birthday was found after " 
                + count + " tries.");
    }
}
/*
How many random people do you have to select before you find three people who
share the same birthday? (That is, all three people were born on the same day in
the same month, but not necessarily in the same year.)
*/
