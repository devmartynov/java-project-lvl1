package hexlet.code;

public interface GameFactory {
    Game createGame(int gameCode) throws Exception;
}
