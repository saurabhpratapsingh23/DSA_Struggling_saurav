import java.util.Scanner;

public class Pra02 {

    // Take name as input and print a greeting message for that particular name.
    // Write a program to input principal, time, and rate (P, T, R) from the user
    // and find Simple Interest.

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        int principal = ob.nextInt();

        System.out.print("Enter time amount: ");
        int time = ob.nextInt();

        System.out.print("Enter rate(%) amount: ");
        int rate = ob.nextInt();

        int simpleInterest = (principal * time * rate) / 100;

        int totalReturn = simpleInterest + principal;

        System.out.println("Simple Interest for the value you entered are: " + simpleInterest);
        System.out.println("your total amount after " + time + " year will be " + totalReturn);

    }
}