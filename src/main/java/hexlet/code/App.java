package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] arg) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("3 - Calculator");
        System.out.println("2 - Even");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        var taskNumber = scanner.nextInt();
        System.out.println();

        switch (taskNumber) {
            case Engine.GREET_CODE -> {
                Engine.greet();
            }
            case Even.GAME_CODE -> {
                Even evenGame = new Even();
                evenGame.start();
            }
            case Calculator.GAME_CODE -> {
                Calculator calculatorGame = new Calculator();
                calculatorGame.start();
            }

            default -> {
            }
        }
    }
}
