package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.stream.IntStream;

public final class ConsoleGameFactory implements GameFactory {

    private static boolean validateCode(int code) {
        int[] codes = {
            Even.GAME_CODE,
            Calculator.GAME_CODE,
            GCD.GAME_CODE,
            Progression.GAME_CODE,
            Prime.GAME_CODE,
        };
        return IntStream.of(codes).anyMatch(_code -> _code == code);
    }

    public Game createGame(int gameCode) throws Exception {

        if (!validateCode(gameCode)) {
            throw new Exception(
                "No game found by given game code: " + gameCode + "!"
                + " You can choose game code from given menu. Please, try again."
            );
        }

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
            case Prime.GAME_CODE -> {
                return new Prime();
            }
            default -> {
                return new GCD();
            }
        }
    }
}
