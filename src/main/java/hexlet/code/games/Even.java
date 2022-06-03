package hexlet.code.games;

import hexlet.code.Engine;

public final class Even extends Engine {

    public static final int GAME_CODE = 2;
    private static final String POSITIVE_ANSWER = "yes";
    private static final String NEGATIVE_ANSWER = "no";

    public void start() {
        greet();

        System.out.println(
                "Answer \'" + POSITIVE_ANSWER + "\' if number even otherwise answer \'" + NEGATIVE_ANSWER + "\'."
        );

        for (var i = 0; i < ROUNDS_COUNT; i++) {
            var num = generateRandomNumber();

            var shouldContinue = super.runGameRound(String.valueOf(num), formatAnswerToUserFormat(isEven(num)));

            if (!shouldContinue) {
                break;
            }
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private String formatAnswerToUserFormat(boolean answer) {
        return answer ? POSITIVE_ANSWER : NEGATIVE_ANSWER;
    }
}
