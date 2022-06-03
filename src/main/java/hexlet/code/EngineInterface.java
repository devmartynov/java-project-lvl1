package hexlet.code;

public interface EngineInterface {
    boolean runGameRound(String question, String expectedAnswer);

    int generateRandomNumber();

    int generateRandomNumber(int maxValue);

    String askQuestion(String question);

    boolean validateAnswer(String expectedAnswer, String answer);

    void showUserValidateMessage(boolean isPositiveValidation, String expectedAnswer, String answer);

    void finishGame(boolean isWin);
}
