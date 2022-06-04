package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;
import hexlet.code.MathUtils;

public final class Progression extends Engine implements Game {
    public static final int GAME_CODE = 5;

    public void start() {
        greet();

        System.out.println("What number is missing in the progression?");

        for (var i = 0; i < ROUNDS_COUNT; i++) {
            var placeOfHiddenNumberInProgression = MathUtils.generateRandomNumber(MathUtils.LENGTH_OF_PROGRESSION);
            String[] progression = MathUtils.generateProgression();

            var expectedAnswer = progression[placeOfHiddenNumberInProgression];

            progression[placeOfHiddenNumberInProgression] = "..";

            var shouldContinue = super.runGameRound(String.join(" ", progression), expectedAnswer);

            if (!shouldContinue) {
                break;
            }
        }

    }
}
