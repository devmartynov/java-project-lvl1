package hexlet.code;

import java.util.Random;

public final class Utils {
    public static final int RANDOM_MAX_VALUE = 100;

    private static final Random RANDOM = new Random();

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
}
