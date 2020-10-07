
public class SnakeEyze
{
	public static void main(String[] args) {
		
		int result = 0;
		int numberOfRolls = 0;
		while (result != 2) {
		int firstDie = (int)(Math.random()*6) + 1;
	    int secondDie = (int)(Math.random()*6) + 1;
	    result = firstDie + secondDie;
		numberOfRolls +=1;
		}
	    
		System.out.println("Total times it take to roll " + numberOfRolls);

	}
}

//How many times do you have to roll a pair of dice before they come up snake eyes?


