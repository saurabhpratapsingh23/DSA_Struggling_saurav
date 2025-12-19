import java.util.Scanner;

public class Pra10 {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number until useer enter 0: ");
        int n = ob.nextInt();

        if (n == 0) {
            System.out.println("Nothing is Entered before 0. ");
            return;
        }

        int largest = n;

        while (true) {
            n = ob.nextInt();

            if (n == 0) {
                break;
            }

            if (n > largest) {
                largest = n;

            }

        }
        System.out.println("The largest of the entered numbers is: " + largest);

    }
}