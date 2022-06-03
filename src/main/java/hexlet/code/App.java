package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] arg) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("2 - Even");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        var taskNumber = scanner.nextInt();
        System.out.println();

        switch (taskNumber) {
            case 1 -> {
                Game notifier = new Game();
                notifier.greet();
                break;
            }
            case 2 -> {
                Even evenGame = new Even();
                evenGame.start();
                break;
            }

            default -> {
            }
        }
    }
}
