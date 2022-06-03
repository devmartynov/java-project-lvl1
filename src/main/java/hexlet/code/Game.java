package hexlet.code;

import java.util.Scanner;

public class Game {
    private String userName;

    public void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        Scanner scanner = new Scanner(System.in);
        var userName = scanner.next();
        this.userName = userName;

        System.out.println("Hello, " + userName + "!");
    }

    public String getUserName() {
        return userName;
    }

}
