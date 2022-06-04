package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;
import hexlet.code.util.MathUtils;

public final class GCD extends Engine implements Game {
    public static final int GAME_CODE = 4;

    public void start() {
        greet();

        System.out.println("Find the greatest common divisor of given numbers.");

        for (var i = 0; i < ROUNDS_COUNT; i++) {
            var num1 = MathUtils.generateRandomNumber();
            var num2 = MathUtils.generateRandomNumber();

            var shouldContinue = super.runGameRound(
                num1 + " " + num2,
                String.valueOf(MathUtils.gcd(num1, num2))
            );

            if (!shouldContinue) {
                break;
            }
        }
    }
}
