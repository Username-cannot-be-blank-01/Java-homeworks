package org.example;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x;
        while (true) {
            System.out.print("Введите вещественное число (-1 < X < 1): ");
            if (scanner.hasNextDouble()) {
                x = scanner.nextDouble();
                if (Math.abs(x) < 1) {
                    break;
                } else {
                    System.out.println("Ошибка: модуль X должен быть меньше 1.");
                }
            } else {
                System.out.println("Ошибка: нужно ввести число.");
                scanner.next();
            }
        }

        int n;
        while (true) {
            System.out.print("Введите целое число N (N > 0): ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Ошибка: N должно быть больше 0.");
                }
            } else {
                System.out.println("Ошибка: нужно ввести целое число.");
                scanner.next();
            }
        }

        double sum = 0.0;
        double degreeofX = 1.0;
        int sign = 1;

        for (int i = 1; i <= n; i++) {
            degreeofX *= x;
            sum += sign * (degreeofX / i);
            sign = -sign;
        }

        System.out.printf("Вычисленная сумма ряда: %.6f\n", sum);

        double exactValue = Math.log(1 + x);
        System.out.printf("Точное значение ln(1+X): %.6f\n", exactValue);
        scanner.close();
    }
}
