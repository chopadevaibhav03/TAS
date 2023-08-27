import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the amount in the source currency
        System.out.print("Enter the amount in the source currency: ");
        double amount = scanner.nextDouble();

        // Input the exchange rate from source to target currency
        System.out.print("Enter the exchange rate (source to target): ");
        double exchangeRate = scanner.nextDouble();

        // Calculate the equivalent amount in the target currency
        double equivalentAmount = amount * exchangeRate;

        // Display the equivalent amount in the target currency
        System.out.println("Equivalent amount in the target currency: " + equivalentAmount);

        scanner.close();
    }
}
