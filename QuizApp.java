import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Question {
    private String questionText;
    private List<String> options;
    private int correctOptionIndex;

    public Question(String questionText, List<String> options, int correctOptionIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    public boolean isCorrect(int userChoice) {
        return userChoice == correctOptionIndex;
    }

    public void displayQuestion() {
        System.out.println(questionText);
        for (int i = 0; i < options.size(); i++) {
            System.out.println(i + 1 + ". " + options.get(i));
        }
    }
}

class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz(List<Question> questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            question.displayQuestion();
            System.out.print("Enter your choice: ");
            int userChoice = scanner.nextInt();
            if (question.isCorrect(userChoice - 1)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was: " + (question) + "\n");
            }
        }
        scanner.close();

        System.out.println("Quiz complete! Your score: " + score + " out of " + questions.size());
    }
}

public class QuizApp {
    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();

        // Add your quiz questions here




        
        Quiz quiz = new Quiz(questions);
        quiz.start();
    }
}

