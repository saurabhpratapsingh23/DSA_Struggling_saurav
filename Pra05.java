import java.util.Scanner;

public class Pra05 {

    // find palinedrome
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter the string to check palinedrome:  ");
        String in = ob.next();
        if (isPalindedrome(in)) {
            System.out.println("yes, it is Palinedrome.....");
        } else {
            System.out.println("No, it is not Palinedrome.....");
        }
        ob.close();

    }

    public static boolean isPalindedrome(String input) {
        if (input == null)
            return false;

        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int l = 0;
        int r = clean.length() - 1;

        while (l < r) {
            if (clean.charAt(l) != clean.charAt(r)) {
                return false;
            }
            l++;
            r--;

        }
        return true;

    }
}