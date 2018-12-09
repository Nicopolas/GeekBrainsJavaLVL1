package GeekBrainsJavaLVL1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by 1 on 09.12.2018.
 */
/*
1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 */
public class GuessTheNumber {
    private static int number;
    private static int attempts;
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        newGame();
    }

    private static void checkNumber(String usersLine) {
        attempts--;
        int usersNumber;

        try {
            usersNumber = Integer.parseInt(usersLine);
        } catch (Exception e) {
            System.out.println("Введенная строка не является числом");
            return;
        }
        if (usersNumber < 0 || usersNumber > 9) {
            System.out.println("Введенное число вышло за диапозон от 0 до 9");
        }

        if (usersNumber > number) {
            System.out.println("Введенное число больше загадонного");
            return;
        } else if (usersNumber < number) {
            System.out.println("Введенное число меньше загадонного");
            return;
        } else {
            System.out.println("Вы угадали заданное число!!!");
            repeatGame();
        }

    }

    private static void printAttempts() {
        System.out.println(attempts + " попытки осталось");
    }

    private static void repeatGame() {
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int usersAnswer;

        try {
            usersAnswer = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println("Введенная строка не является числом");
            return;
        }

        if (usersAnswer == 1) {
            newGame();
            return;
        }
        System.out.println("Завершение программы...");
        System.exit(0);
    }

    private static void newGame() {
        number = (new Random()).nextInt(10);
        attempts = 3;
        System.out.println("\nПрограмма загадала число от 0 до 9");
        System.out.println("Пользователь должен угадать это число");

        while (attempts > 0) {
            printAttempts();
            try {
                checkNumber(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Пользователь не смог отгадать число за отведенное количество попыток");
        repeatGame();
    }
}
