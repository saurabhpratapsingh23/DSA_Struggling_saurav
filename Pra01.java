import java.util.Scanner;

public class Pra01 {

    // Write a program to print whether a number is even or odd, also take input
    // from the user.
    public static void main(String[] args) {

        try (Scanner ob = new Scanner(System.in)) {

            System.out.print("Enter the number to check wheather it is even or odd: ");
            int input = ob.nextInt();

            if (input % 2 == 0) {
                System.out.println("number is even");
            } else {
                System.out.println("number is odd");
            }

        }

    }
}