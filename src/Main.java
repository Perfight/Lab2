import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        double x = in.nextDouble();
        System.out.print("Введите размер: ");
        int size = in.nextInt();

        double result = x;
        for (int n = 1; n <= size; n++) {
            double a = 1;
            for (int i = 1; i <= (2 * n - 1); i++) {
                a *= i;
            }
            double b = 1;
            for (int i = 2; i <= (2 * n + 1); i += 2) {
                b *= i;
            }
            result += a * Math.pow(x, (2 * n + 1)) / b;
        }
        System.out.println("Результат: " + result);

        if (Math.abs(result % x) < 1) {
            System.out.println("Ошибка:|x| должен быть меньше 1.");
        }
    }
}
