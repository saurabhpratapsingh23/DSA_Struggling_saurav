import java.util.Scanner;

public class fibo {

    // To calculate Fibonacci Series up to n numbers.

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);

        System.out.print("Enter the number here ");
        int n = ob.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        long first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            long next = first + second;
            first = second;
            second = next;
        }

    }
}