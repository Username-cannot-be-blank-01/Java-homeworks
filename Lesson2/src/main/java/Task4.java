package org.example;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число A: ");
        double a = scanner.nextDouble();
        double result = sumOfPowers(a);
        System.out.printf("Сумма 3-й, 5-й и 7-й степеней числа %.2f равна: %.2f\n", a, result);
        scanner.close();
    }
    public static double sumOfPowers(double a) {
        return Math.pow(a, 3) + Math.pow(a, 5) + Math.pow(a, 7);
    }
}
