package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;
import hexlet.code.util.GameUtils;
import hexlet.code.util.MathUtils;

public final class Even extends Engine implements Game {

    public static final int GAME_CODE = 2;

    public void start() {
        greet();

        System.out.println(
            "Answer '"
            + GameUtils.POSITIVE_ANSWER
            + "' if number even otherwise answer '"
            + GameUtils.NEGATIVE_ANSWER + "'."
        );

        for (var i = 0; i < ROUNDS_COUNT; i++) {
            var num = MathUtils.generateRandomNumber();

            var shouldContinue = super.runGameRound(
                String.valueOf(num),
                GameUtils.formatAnswerToUserFormat(MathUtils.isEven(num))
            );

            if (!shouldContinue) {
                break;
            }
        }
    }
}
