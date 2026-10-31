import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        System.out.println("Эта программа выводит стоимость товара без НДС");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите стоимость товара: ");
        double price = scanner.nextDouble();

        System.out.println("Введите НДС: ");
        double nds = scanner.nextDouble();

        double result = (price / (100 + nds)) * 100;
        System.out.print("Стоимость товара без НДС: ");
        String str = String.format("%.2f", result);

        System.out.print(str);
    }
}
