import java.util.Scanner;

public class Pra12 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.println("Let's find the average of the given inputs..");
        System.out.print("Enter the number of input your want to find average of:  ");
        int n = ob.nextInt();
        int num = 0;
        // int count = 0;
        int sum = 0;
        System.out.println("Enter the values.");
        for (int i = 1; i <= n; i++) {
            num = ob.nextInt();
            // count++;
            sum += num;

        }
        int avg = sum / n; // count;
        System.out.print("The average of the umbers are: " + avg);
    }
}
