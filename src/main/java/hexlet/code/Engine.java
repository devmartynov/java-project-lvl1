package hexlet.code;

public interface Engine {
    boolean runRound(String question, String expectedAnswer);

    String askQuestion(String question);

    boolean validateAnswer(String expectedAnswer, String answer);

    void showUserValidateMessage(boolean isPositiveValidation, String expectedAnswer, String answer);

    void finish(boolean isWin);
}
