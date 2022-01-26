package demonstration;

import tools.BinOps;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println("Введите первое число в двоичном виде: ");
        String arg0 = scanner.nextLine();
        while (!arg0.matches("[01]+")) {
            System.out.println("Введены недопустимые символы! Введите первое число в двоичном виде: ");
            arg0 = scanner.nextLine();
        }

        System.out.println("Введите второе число в двоичном виде: ");
        String arg1 = scanner.nextLine();
        while (!arg1.matches("[01]+")) {
            System.out.println("Введены недопустимые символы! Введите второе число в двоичном виде: ");
            arg1 = scanner.nextLine();
        }
        System.out.println("Результат вычисления суммы введенных чисел: " + bins.sum(arg0, arg1));
        System.out.println("Результат вычисления произведения введенных чисел: " + bins.mult(arg0, arg1));}
}
