package hexlet.code.games;

import hexlet.code.GameEngine;
import hexlet.code.Game;
import hexlet.code.util.MathUtils;

public final class Calculator extends GameEngine implements Game {
    public static final int GAME_CODE = 3;

    public void start() {
        greet();

        System.out.println("What is the result of the expression?");

        for (var i = 0; i < ROUNDS_COUNT; i++) {
            var num1 = MathUtils.generateRandomNumber();
            var num2 = MathUtils.generateRandomNumber();
            var operator = getRandomMathOperator();

            var shouldContinue = super.runRound(
                num1 + " " + operator + " " + num2,
                String.valueOf(executeMathOperation(operator, num1, num2))
            );

            if (!shouldContinue) {
                break;
            }
        }
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
