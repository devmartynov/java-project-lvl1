package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] arg) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculator");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        var gameCode = scanner.nextInt();
        System.out.println();

        if (gameCode == Engine.GREET_CODE) {
            Engine.greet();
        } else {
            GameFactory factory = new ConsoleGameFactory();

            try {
                Game game = factory.createGame(gameCode);
                game.start();
            } catch (Exception error) {
                System.out.println(error.toString());
            }

        }
    }
}
