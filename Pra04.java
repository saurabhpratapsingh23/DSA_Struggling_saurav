import java.util.Scanner;

public class Pra04 {
    // Input currency in rupees and output in USD.

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter the currency in INR, I'll convert it into $:  ");
        double n = ob.nextDouble();

        double res = n / 90.23;
        System.out.print("INR currency is not doing good these days: " + res);
    }
}