import java.util.Scanner;

/*
Use Interface for the quiz and add subtraction.
 * */
public class AdditionSubtractionQuiz{
     
    public static void main(String[] args) {
        String[] questions = new String[10];
        int[] userAnswer = new int[10];
        int[] correctAnswer = new int[10];
        AdditionSubtractionQuiz popQuiz = new AdditionSubtractionQuiz();
        int finalScore = 0;
        System.out.println("Welcome to the Basic Addition and Subtraction Quiz you will be presented with 10 questions");
        System.out.println("type the answer to each one then hit enter, Good Luck!");
        Scanner testTaker = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            
            AdditionQuestion question = popQuiz.new AdditionQuestion();
            String problem =  question.getQuestion();
            questions[i] = problem;
            System.out.println(problem);
            userAnswer[i] = testTaker.nextInt();
            correctAnswer[i] = question.getCorrectAnswer();
        }
       
        for (int k = 5; k < 10; k++) {                                                                                 
            SubtractionQuestion question = popQuiz.new SubtractionQuestion();
            String problem =  question.getQuestion();
            questions[k] = problem;
            System.out.println(problem);
            userAnswer[k] = testTaker.nextInt();
            correctAnswer[k] = question.getCorrectAnswer();
        }
        
        for (int j = 0; j < 10; j++) {
            System.out.println(questions[j]);
            if (correctAnswer[j] == userAnswer[j]) {
                System.out.println("Correct!");
                finalScore += 10;
            }
            else {
                System.out.println("Incorrect the correct answer is: " + correctAnswer[j]); 
            }
        }
        
        testTaker.close();
        System.out.println("Thank you for participating in this compulsory test your score is: " + finalScore + "/100 ");
    }
    
    public interface IntQuestion {
        public String getQuestion();
        public int getCorrectAnswer();
    }
    
    public class AdditionQuestion implements IntQuestion {
        private int a, b; // The numbers in the problem.
        public AdditionQuestion() { // constructor
            a = (int)(Math.random() * 50 + 1);
            b = (int)(Math.random() * 50);
        }
        public String getQuestion() {
            return "What is " + a + " + " + b + " ?";
        }
        public int getCorrectAnswer() {
            return a + b;
        }
    }
    public class SubtractionQuestion implements IntQuestion {
        private int a, b; // The numbers in the problem.
        public SubtractionQuestion() { // constructor
            a = (int)(Math.random() * 50 + 1);
            b = (int)(Math.random() * 50);
            while (b > a) {
                b = (int)(Math.random() * 50); 
            }
        }
        public String getQuestion() {
            return "What is " + a + " - " + b + " ?";
        }
        public int getCorrectAnswer() {
            return a - b;
        } 
    }
    
}
