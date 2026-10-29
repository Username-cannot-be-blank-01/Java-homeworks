package org.example;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            showMenu();
            System.out.print("Выберите пункт меню: ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        performCalculation(scanner);
                        break;
                    case 2:
                        showProgramInfo();
                        break;
                    case 3:
                        showDeveloperInfo();
                        break;
                    case 4:
                        isRunning = false;
                        System.out.println("Выход.");
                        break;
                    default:
                        System.out.println("Ошибка: такого пункта нет. Попробуйте снова.\n");
                        break;
                }
            } else {
                System.out.println("Ошибка: нужно ввести ЧИСЛО (1-4). Попробуйте снова.\n");
                scanner.next();
            }
        }
        scanner.close();
    }

    static void showMenu() {
        System.out.println("\n    ГЛАВНОЕ МЕНЮ    ");
        System.out.println("1. Выполнить расчёт");
        System.out.println("2. Информация о программе");
        System.out.println("3. Информация о разработчике");
        System.out.println("4. Выход");
    }
    static void performCalculation(Scanner scanner) {
        System.out.println("\n    ВЫЧИСЛЕНИЕ СТОИМОСТИ БЕЗ НДС    ");

        double price = 0;
        while (true) {
            System.out.print("Введите стоимость товара: ");
            if (scanner.hasNextDouble()) {
                price = scanner.nextDouble();
                if (price > 0) {
                    break;
                } else {
                    System.out.println("Ошибка: стоимость должна быть больше нуля.");
                }
            } else {
                System.out.println("Ошибка: нужно ввести число.");
                scanner.next();
            }
        }

        double nds = 0;
        while (true) {
            System.out.print("Введите НДС в процентах: ");
            if (scanner.hasNextDouble()) {
                nds = scanner.nextDouble();
                if (nds >= 0) {
                    break;
                } else {
                    System.out.println("Ошибка: НДС не может быть отрицательным.");
                }
            } else {
                System.out.println("Ошибка: нужно ввести число.");
                scanner.next();
            }
        }
        double result = (price / (100 + nds)) * 100;
        System.out.printf("Стоимость товара без НДС: %.2f\n", result);
    }

    static void showProgramInfo() {
        System.out.println("\n    О ПРОГРАММЕ    ");
        System.out.println("Эта программа рассчитывает стоимость товара без НДС.");
    }

    static void showDeveloperInfo() {
        System.out.println("\n    О РАЗРАБОТЧИКЕ    ");
        System.out.println("Студент: Виталий Ахметгалеев;");
        System.out.println("Группа: РИ-250931.");
    }
}
