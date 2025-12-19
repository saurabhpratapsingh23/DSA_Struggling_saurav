import java.util.Scanner;

public class repeat {

    // find the repeat number from the given value int n = 1245231245342; 2 is
    // repeating 4 times

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number here: ");
        int n = ob.nextInt();

        int count = 0;

        while (n > 0) {
            int rem = n % 10;
            if (rem == 2) {
                count++;
            }
            n = n / 10;

        }
        System.out.println("2 occurs: " + count + " times.");

    }
}
