import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base value: ");
        int base = scanner.nextInt();

        System.out.print("Enter the power value: ");
        int power = scanner.nextInt();

        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.println(base + " raised to the power of " + power + " is: " + result);
        scanner.close();
    }
}
