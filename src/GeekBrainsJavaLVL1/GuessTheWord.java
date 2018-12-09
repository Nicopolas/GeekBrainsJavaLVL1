package GeekBrainsJavaLVL1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by 1 on 09.12.2018.
 */
/*
2 * Создать массив из слов String[] words =
{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
"melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
"pumpkin", "potato"};
При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
apple – загаданное
apricot - ответ игрока
ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
Для сравнения двух слов посимвольно, можно пользоваться:
String str = "apple";
str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
Играем до тех пор, пока игрок не отгадает слово
Используем только маленькие буквы
 */
public class GuessTheWord {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
            "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
            "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    private static String word;
    private static boolean inTheGame;

    public static void main(String[] args) {
        newGame();
    }

    private static void newGame() {
        inTheGame = true;
        word = words[(new Random()).nextInt(words.length)];
        System.out.println("\nПрограмма загадала слово");
        System.out.println("Пользователь должен угадать это слово");

        while (inTheGame) {
            try {
                checkWord(reader.readLine().toLowerCase());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Вы угадали слово!!!");
        repeatGame();

    }

    private static void checkWord(String usersLine) {
        String wordsMask = "";
        if (!checkLine (usersLine)) {
            System.out.println("Проверте данные ввода, в сроке не должно содержаться ничего кроме латинских букв");
            return;
        }

        if (usersLine.equals(word)) {
            inTheGame = false;
            return;
        }

        for (int i = 0; i < word.length();i++){
            if (usersLine.charAt(i) == word.charAt(i)){
                wordsMask = wordsMask + usersLine.charAt(i);
                continue;
            }
            wordsMask = wordsMask + "#";
        }

        while (wordsMask.length() < 15) {
            wordsMask = wordsMask + "#";
        }

        System.out.println("Слово не угаданно:\n"+ wordsMask + "\nПопробуйте еще раз");
        return;
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

    private static boolean checkLine(String usersLine) {
        return usersLine.matches("[a-zA-Z]+");
    }
}
