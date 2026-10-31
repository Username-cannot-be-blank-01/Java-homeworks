package org.example;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
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
        int origN = n;
        int reversed = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n = n / 10;
        }
        System.out.println("Исходное число: " + origN);
        System.out.println("Число справа налево: " + reversed);
        scanner.close();
    }
}
