package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.stream.IntStream;

public class GameFactory {

    public static boolean validateCode(int code) {
        int[] codes = {
            Even.GAME_CODE,
            Calculator.GAME_CODE,
            GCD.GAME_CODE,
            Progression.GAME_CODE,
        };
        return IntStream.of(codes).anyMatch(_code -> _code == code);
    }

    public static Game getGame(int gameCode) {
        switch (gameCode) {
            case Even.GAME_CODE -> {
                return new Even();
            }
            case Calculator.GAME_CODE -> {
                return new Calculator();
            }
            case Progression.GAME_CODE -> {
                return new Progression();
            }
            default -> {
                return new GCD();
            }
        }
    }
}
