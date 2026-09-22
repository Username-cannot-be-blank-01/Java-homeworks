import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a != b) {
            a = a + b;
            b = a;
        } else {
            a = 0; b = a;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
