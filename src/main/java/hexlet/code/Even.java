package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Even extends Game implements Playable {
    private static final String POSITIVE_ANSWER = "yes";
    private static final String NEGATIVE_ANSWER = "no";
    private static final int CORRECT_ANSWERS_COUNT_TO_WIN = 3;
    private int correctAnswersCount = 0;

    private final Random random = new Random();

    @Override
    public void start() {
        this.greet();

        System.out.println("Answer \'" + POSITIVE_ANSWER + "\' if number even otherwise answer \'" + NEGATIVE_ANSWER + "\'.");

        runRound(generateRandomNumber());
    }

    private boolean testAnswer(boolean expectedAnswer, boolean answer) {
        return expectedAnswer == answer;
    }

    private boolean validateAnswer(String answer) {
        return answer.equals(POSITIVE_ANSWER) || answer.equals(NEGATIVE_ANSWER);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private void showCheckResultMessage(boolean isPositiveCheck, String expectedAnswer, String answer) {
        System.out.println(isPositiveCheck ? "Correct!" : "\'" + answer + "\' is wrong answer ;(. Correct answer was \'" + expectedAnswer + "\'.");
    }

    private int generateRandomNumber() {
        return this.random.nextInt(100);
    }

    private boolean formatAnswerToGameFormat(String answer) {
        return answer.equals(POSITIVE_ANSWER);
    }

    private String formatAnswerToUserFormat(boolean answer) {
        return answer ? POSITIVE_ANSWER : NEGATIVE_ANSWER;
    }

    private void finish(boolean isWin) {
        System.out.println(isWin ? "Congratulations, " + getUserName() + "!" : "Let's try again, " + getUserName() + "!");
    }

    private boolean runRound(int number) {
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");

        Scanner scanner = new Scanner(System.in);

        var userAnswer = scanner.next();
        var correctAnswer = isEven(number);
        var correctAnswerInUserFormat = formatAnswerToUserFormat(correctAnswer);
        var userAnswerInGameFormat = formatAnswerToGameFormat(userAnswer);

        if (!validateAnswer(userAnswer)) {
            showCheckResultMessage(
                    false,
                    correctAnswerInUserFormat,
                    userAnswer
            );
            finish(false);
            return false;
        }

        var isCorrectAnswer = testAnswer(correctAnswer, userAnswerInGameFormat);

        showCheckResultMessage(isCorrectAnswer, correctAnswerInUserFormat, userAnswer);

        if (isCorrectAnswer) {
            if (++correctAnswersCount == CORRECT_ANSWERS_COUNT_TO_WIN) {
                finish(true);
                return true;
            }
        } else {
            finish(false);
            return false;
        }

        return runRound(generateRandomNumber());
    }
}
