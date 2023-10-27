package utils;

import java.util.Scanner;

public class ConsoleUtils {

    private static Scanner scanner = new Scanner(System.in);

    public static void print(String message) {
        System.out.print(message);
    }

    public static void println(String message) {
        System.out.println(message);
    }

    public static String readLine() {
        return scanner.nextLine();
    }

    public static int readInt() {
        int value = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        return value;
    }

}
