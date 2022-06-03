package hexlet.code;

import java.util.Scanner;

public class Game {
    private String userName;

    /**
     * Say hello and ask user for name.
     */
    public void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        userName = scanner.next();

        System.out.println("Hello, " + userName + "!");
    }

    /**
     * Returns userName.
     *
     * @return String
     */
    public String getUserName() {
        return userName;
    }

}
