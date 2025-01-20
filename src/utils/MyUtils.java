package utils;

public class MyUtils {
    // Переименованный вывод на экран
    public static void print(Object message) {
        System.out.println(message);
    }

    // Переименованный вывод ошибок
    public static void err(Object message) {
        System.err.println(message);
    }

    // Альтернатива System.exit
    public static void bye(int code) {
        System.exit(code);
    }

    // Альтернатива Thread.sleep
    public static void nap(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            err("Nap interrupted: " + e.getMessage());
        }
    }

    // Печать форматированного текста
    public static void printf(String format, Object... args) {
        System.out.printf(format, args);
    }

    // Ввод строки с консоли
    public static String getInput() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextLine();
    }

    // Сокращаем String[] args
    public static String[] s(String[] args){
        return args;
    }

    // Ввод числа с консоли
    public static int getInt() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextInt();
    }

    // Ввод числа с плавающей запятой
    public static double getDouble() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        return scanner.nextDouble();
    }
}
