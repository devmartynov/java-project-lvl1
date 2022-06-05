package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;
import hexlet.code.util.MathUtils;

public final class Progression implements Game {
    public static final int GAME_CODE = 5;

    private static final String RULES = "What number is missing in the progression?";

    public void start() {
        System.out.println(RULES);

        Engine.startGame(this);
    }

    public String[] getConditionAndExpectedResult() {
        var placeOfHiddenNumberInProgression = MathUtils.generateRandomNumber(MathUtils.LENGTH_OF_PROGRESSION);
        String[] progression = MathUtils.generateProgression();

        var expectedAnswer = progression[placeOfHiddenNumberInProgression];

        progression[placeOfHiddenNumberInProgression] = "..";

        return new String[]{
            String.join(" ", progression),
            expectedAnswer
        };
    }
}
