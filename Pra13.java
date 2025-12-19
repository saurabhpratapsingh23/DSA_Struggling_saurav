import java.util.Scanner;

public class Pra13 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter the String you want to reverse: ");
        String str = ob.nextLine().trim();

        char[] chars = str.toCharArray();

        int l = 0;
        int r = chars.length - 1;

        while (l < r) {
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;
            r--;
        }
        String newString = new String(chars);
        System.out.println("New String which is reversed: " + newString);

    }
}
