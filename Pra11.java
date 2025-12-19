import java.util.Scanner;

public class Pra11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the electricity units consumed: ");
        double units = sc.nextDouble();

        // Input validation
        if (units < 0) {
            System.out.println("Error: Units consumed cannot be negative!");
            sc.close();
            return;
        }

        double amount = 0.0;

        if (units <= 50) {
            amount = units * 0.50;
        } else if (units <= 150) {
            amount = 50 * 0.50 + (units - 50) * 0.75;
        } else if (units <= 250) {
            amount = 50 * 0.50 + 100 * 0.75 + (units - 150) * 1.20;
        } else { // units > 250
            amount = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (units - 250) * 1.50;
        }

        double surcharge = amount * 0.20;
        double totalAmount = amount + surcharge;

        // Formatted output for better readability
        System.out.println("\n--- Electricity Bill Details ---");
        System.out.printf("Units Consumed       : %.2f%n", units);
        System.out.printf("Base Amount          : ₹%.2f%n", amount);
        System.out.printf("Surcharge (20%%)      : ₹%.2f%n", surcharge);
        System.out.printf("Total Bill Amount    : ₹%.2f%n", totalAmount);

        sc.close();
    }
}