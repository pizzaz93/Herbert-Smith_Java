/*
Use Class for the question.
 * /
 
public class QuizQuestion {
    
    public static void main(String[] args) {
        String[] questions = new String[10];
        int[] userAnswer = new int[10];
        int[] correctAnswer = new int[10];
        QuizQuestion popQuiz = new QuizQuestion();
        int finalScore = 0;
        System.out.println("Welcome to the Addition Quiz you will be presented with 10 questions");
        System.out.println("type the answer to each one then hit enter, Good Luck!");
        Scanner testTaker = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            AdditionQuestion question = popQuiz.new AdditionQuestion();
            String problem =  question.getQuestion();
            questions[i] = problem;
            System.out.println(problem);
            userAnswer[i] = testTaker.nextInt();
            correctAnswer[i] = question.getCorrectAnswer();
           
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
    
    public class AdditionQuestion {
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
}
