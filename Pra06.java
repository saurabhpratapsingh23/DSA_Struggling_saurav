import java.util.Scanner;

public class Pra06 {
    // find ARMSTRONG number of the gien input
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter the Number here: ");
        int in = ob.nextInt();
        int oG = in;
        int sum = 0;
        while (in > 0) {
            int rem = in % 10;
            in = in / 10;
            sum = sum + rem * rem * rem;
        }
        if (oG == sum) {
            System.out.println("it is");
            return;
        } else {
            System.out.println("it is not!!!");
            return;
        }

    }

}
