package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;
import hexlet.code.util.GameUtils;
import hexlet.code.util.MathUtils;

public final class Prime implements Game {
    public static final int GAME_CODE = 6;

    public static final int MAX_RANDOM_VALUE = 30;

    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public void start() {
        System.out.println(RULES);

        Engine.startGame(this);
    }

    public String[] getConditionAndExpectedResult() {
        var num = MathUtils.generateRandomNumber(MAX_RANDOM_VALUE);

        return new String[]{
            String.valueOf(num),
            GameUtils.formatAnswerToUserFormat(MathUtils.isPrime(num))
        };
    }
}
