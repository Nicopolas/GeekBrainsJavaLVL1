package JavaLVL1Lesson1;

public class Main {

    public static void main(String args[]) {
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807L;
        float e = 3.14159f;
        double f = 3.14159;
        char g = 'a';
        boolean h = true;
        String str = "String";

        System.out.println(firstMethod(1, 2, 3, 4));
        System.out.println(secondMethod(5, 5));
        System.out.println(secondMethod(5, 25));
    }

    private static double firstMethod(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    private static boolean secondMethod(int a, int b) {
        return (a + b <= 20 && a + b >= 10);
    }
}
