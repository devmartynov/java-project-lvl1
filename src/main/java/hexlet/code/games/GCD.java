package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;
import hexlet.code.util.MathUtils;

public final class GCD implements Game {
    public static final int GAME_CODE = 4;

    private static final String RULES = "Find the greatest common divisor of given numbers.";

    public void start() {
        System.out.println(RULES);

        Engine.startGame(this);
    }

    public String[] getConditionAndExpectedResult() {
        var num1 = MathUtils.generateRandomNumber();
        var num2 = MathUtils.generateRandomNumber();

        return new String[]{
            num1 + " " + num2,
            String.valueOf(MathUtils.gcd(num1, num2))
        };
    }
}
