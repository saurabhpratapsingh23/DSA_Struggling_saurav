import java.util.Scanner;

public class Pra09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want factor of: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Enter postive number");
        } else {

            System.out.print("Entered numbers is factor of: " + n + ":- ");
            for (int i = 1; i <= n; i++) {

                if (n % i == 0) {
                    System.out.print(i + ", ");
                }

            }
            // System.out.println();

        }
    }
}
