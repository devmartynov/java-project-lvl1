package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;
import hexlet.code.util.MathUtils;

public final class Calculator implements Game {
    public static final int GAME_CODE = 3;

    private static final String RULES = "What is the result of the expression?";

    public void start() {
        System.out.println(RULES);

        Engine.startGame(this);
    }

    public String[] getConditionAndExpectedResult() {
        var num1 = MathUtils.generateRandomNumber();
        var num2 = MathUtils.generateRandomNumber();
        var operator = getRandomMathOperator();

        return new String[]{
            num1 + " " + operator + " " + num2,
            String.valueOf(executeMathOperation(operator, num1, num2))
        };
    }

    private String getRandomMathOperator() {
        return MathUtils.MATH_OPERATORS[MathUtils.generateRandomNumber(MathUtils.MATH_OPERATORS.length)];
    }

    private int executeMathOperation(String operation, int num1, int num2) {
        switch (operation) {
            case "+" -> {
                return MathUtils.add(num1, num2);
            }
            case "-" -> {
                return MathUtils.subtract(num1, num2);
            }
            case "*" -> {
                return MathUtils.multiply(num1, num2);
            }
            default -> {
                return MathUtils.divide(num1, num2);
            }
        }
    }
}
