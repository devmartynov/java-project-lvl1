package hexlet.code.games;

import hexlet.code.GameEngine;
import hexlet.code.Game;
import hexlet.code.util.GameUtils;
import hexlet.code.util.MathUtils;

public final class Prime extends GameEngine implements Game {
    public static final int GAME_CODE = 6;

    public static final int MAX_RANDOM_VALUE = 30;

    public void start() {
        greet();

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (var i = 0; i < ROUNDS_COUNT; i++) {
            var num = MathUtils.generateRandomNumber(MAX_RANDOM_VALUE);

            var shouldContinue = super.runRound(
                String.valueOf(num),
                GameUtils.formatAnswerToUserFormat(MathUtils.isPrime(num))
            );

            if (!shouldContinue) {
                break;
            }
        }
    }
}
