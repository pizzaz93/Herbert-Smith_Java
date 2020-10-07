public class BoithdayDifferent {

    public static void main(String[] args) {

        boolean[] used; 
 
        int count;       

        used = new boolean[365]; 
        
        count = 0;
        
        for (int i = 0; i < 365; i++) {
            
            int birthday;  
            birthday = (int)(Math.random()*365);
            
            used[birthday] = true;
        }
     
        for (int k = 0; k < used.length; k++) {
                if (used[k]) {
                    count++;
                }
        } 
        System.out.println("The number of different birthdays is " 
                + count + " :)");
    
    }
}
/*
Suppose you choose 365 people at random. How many different birthdays will they
have? (The number could theoretically be anywhere from 1 to 365).
*/
