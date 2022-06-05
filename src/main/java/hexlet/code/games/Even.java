package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;
import hexlet.code.util.GameUtils;
import hexlet.code.util.MathUtils;

public final class Even implements Game {
    public static final int GAME_CODE = 2;

    private static final String RULES = "Answer '"
        + GameUtils.POSITIVE_ANSWER
        + "' if number even otherwise answer '"
        + GameUtils.NEGATIVE_ANSWER + "'.";

    public String[] getConditionAndExpectedResult() {
        var num = MathUtils.generateRandomNumber();
        var condition = String.valueOf(num);
        var expectedValue = GameUtils.formatAnswerToUserFormat(MathUtils.isEven(num));

        return new String[] {condition, expectedValue};
    }

    public void start() {
        System.out.println(RULES);

        Engine.startGame(this);
    }
}
