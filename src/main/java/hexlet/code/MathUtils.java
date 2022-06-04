package hexlet.code;

import java.util.Random;

public class MathUtils {
    public static final String[] MATH_OPERATORS = {"+", "-", "*", "/"};

    /**
     * Upper bound of random range.
     * This bound is excluded in range.
     *
     * @see #RANDOM
     */
    public static final int RANDOM_MAX_VALUE = 100;

    /**
     * Length of arithmetic progression.
     */
    public static final int LENGTH_OF_PROGRESSION = 10;

    /**
     * Difference of arithmetic progression or step between number in progression.
     */
    public static final int DIFFERENCE_OF_PROGRESSION = 2;

    private static final Random RANDOM = new Random();

    /**
     * Add two numbers.
     *
     * @param num1 integer
     * @param num2 integer
     * @return sum of num1 and num2
     */
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Subtract two numbers.
     *
     * @param num1 integer
     * @param num2 integer
     * @return difference between num1 and num2
     */
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Multiply two numbers.
     *
     * @param num1 integer
     * @param num2 integer
     * @return result of multiplying num1 by num2 in integer form
     */
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Divide two numbers.
     *
     * @param num1 integer
     * @param num2 integer
     * @return result of dividing num1 by num2 in integer form
     */
    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    /**
     * Check if number is an even number.
     *
     * @param number integer to check if it's an even number
     * @return result of checking
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Check if number is a prime number.
     *
     * @param number integer to check if it's a prime number
     * @return boolean
     */
    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }

        for (var i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Generate random number up to RANDOM_MAX_VALUE.
     *
     * @return integer
     * @see #RANDOM_MAX_VALUE
     */
    public static int generateRandomNumber() {
        return RANDOM.nextInt(RANDOM_MAX_VALUE);
    }

    /**
     * Generate random number up to maxValue.
     *
     * @param maxValue upper bound of random range (excluded)
     * @return integer
     */
    public static int generateRandomNumber(int maxValue) {
        return RANDOM.nextInt(maxValue);
    }

    /**
     * Get the greatest common divisor of two numbers.
     *
     * @param num1 integer
     * @param num2 integer
     * @return found gcd or 1
     */
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

    /**
     * Generate array which is arithmetic progression.
     * For details see <a href="https://en.wikipedia.org/wiki/Arithmetic_progression">wikipedia</a>
     *
     * @param progressionLength  length of progression
     * @param progressionDifference difference of progression
     * @return array of strings
     */
    public static String[] generateProgression(int progressionLength, int progressionDifference) {
        String[] progression = new String[progressionLength];
        var firstNumberOfProgression = MathUtils.generateRandomNumber();

        for (var i = 0; i < progressionLength; i++) {

            // a(1) + (n - 1) * d;
            // a(1) - first element of progression
            // n - i + 1 because i starts with 0
            // d - difference of progression or step between numbers in progression
            var number = firstNumberOfProgression + ((i + 1) - 1) * progressionDifference;
            progression[i] = String.valueOf(number);
        }

        return progression;
    }

    /**
     * Generate array which is arithmetic progression.
     * For details see <a href="https://en.wikipedia.org/wiki/Arithmetic_progression">wikipedia</a>
     *
     * @return array of strings
     */
    public static String[] generateProgression() {
        return generateProgression(LENGTH_OF_PROGRESSION, DIFFERENCE_OF_PROGRESSION);
    }
}
