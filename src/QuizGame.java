import java.util.Scanner;

public class QuizGame {
    public static void main (String[] args){
        // Quiz Game

        //Questions Array[]
        String[] questions = {"What is the main function of a router?",
                "wWhich part of the computer is considered the brain?",
                "What year was facebook launched?",
                "Who is known as the father of computers?",
                "What was the first programming language?"};


        //Options Array[]
        String[][] options = {
                {"1. Storing Files", "2. Encrypting Data","3. Directing Internet Traffic", "4. Managing Passwords"},
                {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};

        // Declare variables

        int[] answers = {3,1,2,4,3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        //Welcome message
        System.out.println("#########################");
        System.out.println("Welcome to the Quiz Game!");
        System.out.println("#########################");

        //List each question (loop)
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            //options
            for(String option : options[i]){//after printing a question loop tru and list all the options
                System.out.println(option);
            }
            //  Get Guess
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            //  Check your guess
            if(guess == answers[i]){
                System.out.println("#######");
                System.out.println("CORRECT");
                System.out.println("#######");
                score++;
            }
            else{
                System.out.println("#######");
                System.out.println(" WRONG ");
                System.out.println("#######");
            }
        }
        //Display Final Score
        System.out.println("Your final score is: " + score + " out of "+ questions.length);

        scanner.close();
    }
}
