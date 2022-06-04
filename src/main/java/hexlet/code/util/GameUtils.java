package hexlet.code.util;

public final class GameUtils {

    public static final String POSITIVE_ANSWER = "yes";
    public static final String NEGATIVE_ANSWER = "no";

    public static String formatAnswerToUserFormat(boolean answer) {
        return answer ? POSITIVE_ANSWER : NEGATIVE_ANSWER;
    }
}
