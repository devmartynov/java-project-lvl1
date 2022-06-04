package hexlet.code;

import java.util.Scanner;

public class GameEngine implements Engine {

    public static final int GREET_CODE = 1;

    public static final int ROUNDS_COUNT = 3;

    private static String userName;

    private int correctAnswerCount = 0;

    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        userName = scanner.next();

        System.out.println("Hello, " + userName + "!");
    }

    /**
     * Run round in game.
     * This method is executed in loop.
     *
     * @param question       expression to user solve
     * @param expectedAnswer value which is result of solving expression
     * @return should user to go to next round
     */
    public boolean runRound(String question, String expectedAnswer) {
        var userAnswer = askQuestion(question);

        if (!validateAnswer(expectedAnswer, userAnswer)) {
            showUserValidateMessage(false, expectedAnswer, userAnswer);
            finish(false);
            correctAnswerCount = 0;
            return false;
        } else if (++correctAnswerCount == ROUNDS_COUNT) {
            showUserValidateMessage(true, expectedAnswer, userAnswer);
            finish(true);
            correctAnswerCount = 0;
            return false;
        }

        showUserValidateMessage(true, expectedAnswer, userAnswer);

        return true;
    }

    /**
     * Ask user an answer.
     * Print question and request user to type the answer.
     *
     * @param question expression to user solve
     * @return user answer as String
     */
    public String askQuestion(String question) {
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    /**
     * Validate user answer by equaling with expected answer.
     *
     * @param expectedAnswer correct answer
     * @param answer         user answer
     * @return validation result as boolean
     * @see #equals(Object)
     */
    public boolean validateAnswer(String expectedAnswer, String answer) {
        return expectedAnswer.equals(answer);
    }

    /**
     * Print validation message. Let user know if its answer is correct or no.
     *
     * @param isPositiveValidation validation result as boolean
     * @param expectedAnswer       correct answer
     * @param answer               user answer
     * @see #validateAnswer
     */
    public void showUserValidateMessage(boolean isPositiveValidation, String expectedAnswer, String answer) {
        System.out.println(isPositiveValidation
                ? "Correct!"
                : "'" + answer + "' is wrong answer ;(. Correct answer was '" + expectedAnswer + "'."
        );
    }

    /**
     * Print message to user depending on winning or losing the game.
     *
     * @param isWin has user win lost the game
     */
    public void finish(boolean isWin) {
        System.out.println(isWin ? "Congratulations, " + userName + "!" : "Let's try again, " + userName + "!");
    }
}
