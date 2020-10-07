*
Write a program that administers a basic addition quiz to the user. There should be
ten questions. Each question is a simple addition problem such as 17 + 42, where the
numbers in the problem are chosen at random (and are not too big). The program should
ask the user all ten questions and get the user’s answers. After asking all the questions, the
user should print each question again, with the user’s answer. If the user got the answer
right, the program should say so; if not, the program should give the correct answer. At
the end, tell the user their score on the quiz, where each correct answer counts for ten
points.
The program should use three subroutines, one to create the quiz, one to administer
the quiz, and one to grade the quiz. It can use three arrays, with three global variables
of type int[ ], to refer to the arrays. The first array holds the first number from every
question, the second holds the second number from every questions, and the third holds
the user’s answers.
 * */

public class QuzinosQuiz {
    int[] firstNumber = new int[10];
    int[] secondNumber = new int[10];
    int[] userAnswer = new int[10];
    Scanner testTaker = new Scanner(System.in);
  
    public static void main(String[] args) {
        QuzinosQuiz popQuiz = new QuzinosQuiz();
        popQuiz.createQuiz();
        popQuiz.giveTest();
        popQuiz.gradingTime();
    }
    
    public void createQuiz() {
    
        int max = 50;
        int min = 1;
        int range = max - min + 1;
            for (int i = 0; i < 10; i++) {
                firstNumber[i] = (int)(Math.random() * range) + min;
                secondNumber[i] = (int)(Math.random() * range) + min;
            }
            
        }
    
    
    public void giveTest(){
        
        System.out.println("Welcome to the Addition Quiz you will be presented with 10 questions");
        System.out.println("type the answer to each one then hit enter, Good Luck!");
        for (int i = 0; i < 10; i++) {
            System.out.println(firstNumber[i] + " + " + secondNumber[i]);
            userAnswer[i] = testTaker.nextInt();
        }
        testTaker.close();
    }

    public void gradingTime() {
        int sum = 0;
        int finalScore = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(firstNumber[i] + " + " + secondNumber[i]);
            sum = firstNumber[i] + secondNumber[i];
            if (sum == userAnswer[i]) {
                System.out.println("Correct!");
                finalScore += 10;
            }
            else {
                System.out.println("Incorrect the correct answe is: " + sum); 
            }
           
        }
        System.out.println("Thank you for participating in this compulsory test your score is: " + finalScore + "/100 ");
    }
}
