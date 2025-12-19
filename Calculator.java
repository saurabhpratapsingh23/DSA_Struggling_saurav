import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        int res = 0;
        System.out.println("Your Calculator is being started, input values on instructions: ");
        while (true) {

            System.out.println("Enter 'P' or 'p' to exit here only AND 'no' to continue..' ");
            char op = ob.next().trim().charAt(0);
            if (op == 'P' || op == 'p') {
                System.out.println("visit again........");
                break;
            }
            System.out.println("Enter First number here: ");
            int num1 = ob.nextInt();
            System.out.println("Enter Second number here: ");
            int num2 = ob.nextInt();

            System.out.println("Enter the operation (*,/,-,+,%) you want to perform:  ");
            op = ob.next().trim().charAt(0);
            // while (true) {
            if (op == '+') {
                res = num1 + num2;
                System.out.println("Your " + num1 + " + " + num2 + "= " + res);
            } else if (op == '-') {
                res = num1 - num2;
                System.out.println("Your " + num1 + " - " + num2 + "= " + res);
            } else if (op == '*') {
                res = num1 * num2;
                System.out.println("Your " + num1 + " * " + num2 + "= " + res);
            } else if (op == '/') {
                res = num1 / num2;
                System.out.println("Your " + num1 + " / " + num2 + "= " + res);
            } else if (op == '%') {
                res = (num1 % num2) / 100;
                System.out.println("Your " + num1 + " + " + num2 + "= " + res);
            } else if (op == 'x') {

                System.out.println("Terminating the Calculator.......");
                break;

            } else {

                System.out.println(
                        "Invalid operator, Thank you for using......................................................................");
            }
            // System.out.println(res);

        }

    }
}