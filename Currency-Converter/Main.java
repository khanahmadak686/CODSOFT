import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("💱 Currency Converter");

        // Step 1: Select currencies
        System.out.print("Enter base currency (USD, INR, EUR, GBP): ");
        String from = sc.next().toUpperCase();

        System.out.print("Enter target currency (USD, INR, EUR, GBP): ");
        String to = sc.next().toUpperCase();

        // Step 2: Enter amount
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        // Step 3: Convert
        double result = converter.convert(from, to, amount);

        // Step 4: Display result
        if (result != 0) {
            System.out.println("✅ Converted Amount: " + result + " " + to);
        }

        sc.close();
    }
}