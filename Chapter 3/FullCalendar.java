public class FullCalendar {

    public static void main(String[] args) {

        boolean[] used; 
 
        int count;       

        used = new boolean[365]; 
        
        count = 0;
        
        String calendar = "room";
        
        while (calendar == "room") {
            
            int birthday;  
            birthday = (int)(Math.random()*365);
            count++;
            
            if (!used[birthday]) {
                used[birthday] = true;  
            }
            
            calendar = "full";
            for (int k = 0; k < used.length; k++) {
                
                if (!used[k]) {
                   calendar = "room"; 
                }
                
           }
        }
        
        System.out.println("It took " 
                + count + " random tries to fillup every day of the calendar with a persons birthday .");
    
    }
}
/*
How many different people do you have to check before you’ve found at least one
person with a birthday on each of the 365 days of the year?
*/
