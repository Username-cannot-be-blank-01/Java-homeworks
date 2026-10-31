package org.example;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n > 0) {
                double sum = 0.0;
                for (int i = 1; i <= n; i++) {
                    sum += 1.0 / i;
                }
                System.out.printf("Сумма ряда равна: %.3f\n", sum);
            }   else {
                System.out.println("Ошибка: Число должно быть больше нуля.");
            }
        } else {
            System.out.println("Ошибка: Введено нецелое число.");
        }
        scanner.close();
    }
}
