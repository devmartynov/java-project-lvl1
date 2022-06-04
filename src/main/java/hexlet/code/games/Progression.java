package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;

public final class Progression extends Engine implements Game {
    public static final int GAME_CODE = 5;

    private static final int LENGTH_OF_PROGRESSION = 10;

    private static final int DIFFERENCE_OF_PROGRESSION = 2;

    public void start() {
        greet();

        System.out.println("What number is missing in the progression?");

        for (var i = 0; i < ROUNDS_COUNT; i++) {
            var placeOfHiddenNumberInProgression = generateRandomNumber(LENGTH_OF_PROGRESSION);
            String[] progression = generateProgression();

            var expectedAnswer = progression[placeOfHiddenNumberInProgression];

            progression[placeOfHiddenNumberInProgression] = "..";

            var shouldContinue = super.runGameRound(String.join(" ", progression), expectedAnswer);

            if (!shouldContinue) {
                break;
            }
        }

    }

    private String[] generateProgression() {
        String[] progression = new String[LENGTH_OF_PROGRESSION];
        var firstNumberOfProgression = generateRandomNumber();

        for (var i = 0; i < LENGTH_OF_PROGRESSION; i++) {
            progression[i] = String.valueOf(getProgressionNumber(
                firstNumberOfProgression,
                i + 1
            ));
        }

        return progression;
    }

    private int getProgressionNumber(int firstNumber, int n) {
        return firstNumber + (n - 1) * DIFFERENCE_OF_PROGRESSION;
    }
}
