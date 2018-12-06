package JavaLVL1Lesson1;

public class Main {

    public static void main(String args[]) {
        firstMethod();
        secondMethod();
        thirdMethod();
        fourthMethod();
        fifthMethod();

        int[] integerArray = {1, 1, 1, 2, 1};
        System.out.println(sixthMethod(integerArray));
        int[] secondIntegerArray = {2, 1, 1, 2, 1};
        System.out.println(sixthMethod(secondIntegerArray));
        System.out.println();
    }

    /*
    1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    private static void firstMethod() {
        int[] integerArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] == 0) {
                integerArray[i] = 1;
                continue;
            }
            integerArray[i] = 0;
        }

        arrayOutput(integerArray);
    }

    /*
    2. Задать пустой целочисленный массив размером 8.
    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */
    private static void secondMethod() {
        int[] integerArray = new int[8];

        for (int i = 0; i < integerArray.length; i++) {
            if (i == 0) {
                integerArray[i] = 0;
                continue;
            }
            integerArray[i] = integerArray[i - 1] + 3;
        }

        arrayOutput(integerArray);
    }

    /*
    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    private static void thirdMethod() {
        int[] integerArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] < 6) {
                integerArray[i] *= 2;
            }
        }

        arrayOutput(integerArray);
    }

    /*
    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */
    private static void fourthMethod() {
        int size = 3;
        int[][] quadtressArray = new int[size][size];

        int i = 0;
        for (int eachArr[] : quadtressArray) {
            for (int j = 0; j < eachArr.length; j++) {
                if (i == j) {
                    quadtressArray[i][j] = 1;
                    continue;
                }
                if (size == i + j + 1) {
                    quadtressArray[i][j] = 1;
                }
            }
            i++;
        }

        arrayOutput(quadtressArray);
    }

    /*
    5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
     */
    private static void fifthMethod() {
        int[] integerArray = {1, -5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = integerArray[1];
        int max = integerArray[1];

        for (int i : integerArray) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println();
    }

    /*
    6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
    Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
    checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не входят.
     */
    private static boolean sixthMethod(int arr[]) {
        int border = (int) Math.ceil(arr.length / 2d);
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < border; i++) {
            sum1 += arr[i];
        }
        for (int i = border; i < arr.length; i++) {
            sum2 += arr[i];
        }
        return sum1 == sum2;
    }

    private static void arrayOutput(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    private static void arrayOutput(int arr[][]) {
        for (int i[] : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
