import java.util.Scanner;

public class Prac03 {

    public static void main(String[] args) {
        try (Scanner ob = new Scanner(System.in)) {
            System.out.print("Try kr: ");

            String str = ob.nextLine();

            System.out.println("Hann bhai aagya yaad sb: " + str);
        }
    }

}
