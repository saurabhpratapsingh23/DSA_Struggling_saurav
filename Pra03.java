import java.util.Scanner;

public class Pra03 {

    // Take 2 numbers as input and print the largest number.

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);

        System.out.println("Let's find larget amount 2 numbers........");
        System.out.print("Enter the number 1 : ");
        int n1 = ob.nextInt();
        System.out.print("Enter the numebr 2: ");
        int n2 = ob.nextInt();

        // if (n1 < n2) {
        // System.out.println("Number 2 is largest than Number 1");
        // } else {
        // System.out.println("Ooopppssss you are here to find larget not smaller...");
        // }

        boolean res = (n1 < n2) ? true : false;
        System.out.println(res);

    }
}