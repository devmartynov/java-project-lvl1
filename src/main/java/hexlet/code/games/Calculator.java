package hexlet.code.games;

import hexlet.code.Engine;

public final class Calculator extends Engine {
    public static final int GAME_CODE = 3;

    private static final String[] MATH_OPERATORS = {"+", "-", "*", "/"};

    public void start() {
        greet();

        System.out.println("What is the result of the expression?");

        for (var i = 0; i < ROUNDS_COUNT; i++) {
            var num1 = generateRandomNumber();
            var num2 = generateRandomNumber();
            var operation = getRandomMathOperator();

            var shouldContinue = super.runGameRound(
                    num1 + " " + operation + " " + num2,
                    String.valueOf(executeMathOperation(operation, num1, num2))
            );

            if (!shouldContinue) {
                break;
            }
        }
    }

    private String getRandomMathOperator() {
        return MATH_OPERATORS[generateRandomNumber(MATH_OPERATORS.length)];
    }

    private int executeMathOperation(String operation, int num1, int num2) {
        switch (operation) {
            case "+" -> {
                return add(num1, num2);
            }
            case "-" -> {
                return subtract(num1, num2);
            }
            case "*" -> {
                return multiply(num1, num2);
            }
            default -> {
                return divide(num1, num2);
            }
        }
    }

    private static int add(int num1, int num2) {
        return num1 + num2;
    }

    private static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    private static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    private static int divide(int num1, int num2) {
        return num1 / num2;
    }
}
