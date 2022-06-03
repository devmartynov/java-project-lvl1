package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;

public final class GCD extends Engine implements Game {
    public static final int GAME_CODE = 4;

    private static final int RANDOM_MAX_VALUE = 20;

    public void start() {
        greet();

        System.out.println("Find the greatest common divisor of given numbers.");

        for (var i = 0; i < ROUNDS_COUNT; i++) {
            var num1 = generateRandomNumber(RANDOM_MAX_VALUE);
            var num2 = generateRandomNumber(RANDOM_MAX_VALUE);

            var shouldContinue = super.runGameRound(num1 + " " + num2, String.valueOf(gcd(num1, num2)));

            if (!shouldContinue) {
                break;
            }
        }
    }

    public static int gcd(int num1, int num2) {
        var i = Math.min(Math.abs(num1), Math.abs(num2));

        while (i >= 0) {
            if (num1 % i == 0 && num2 % i == 0) {
                break;
            }

            i--;
        }

        return i;
    }
}
