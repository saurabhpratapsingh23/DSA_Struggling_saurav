import java.util.Scanner;
import java.util.Arrays;

public class Pra14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array!!");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Using Arrays in-built function
        System.out.println(Arrays.toString(arr));

        // using enhanced looops to print
        for (int pri : arr) {
            System.out.print(pri + ", ");
        }
    }

}