import java.util.HashMap;

public class CurrencyConverter {

    private HashMap<String, Double> rates;

    public CurrencyConverter() {
        rates = new HashMap<>();

        // Base: USD
        rates.put("USD", 1.0);
        rates.put("INR", 83.0);
        rates.put("EUR", 0.92);
        rates.put("GBP", 0.78);
    }

    // Convert method
    public double convert(String from, String to, double amount) {

        if (!rates.containsKey(from) || !rates.containsKey(to)) {
            System.out.println("❌ Invalid currency!");
            return 0;
        }

        double baseAmount = amount / rates.get(from); // convert to USD
        return baseAmount * rates.get(to); // convert to target
    }
}