import java.util.Scanner;

public class ReverseNumber {

    // reverse the number of the given value. eg- 123 = 321
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter the number here: ");
        int n = ob.nextInt();
        int res = 0;
        for (int i = 0; i <= n; i++) {
            int rem = n % 10;
            n = n / 10;

            res = res * 10 + rem;

        }
        System.out.println("your reversed number is: " + res);
    }
}
