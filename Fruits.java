import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.println("enter fruits here, I'll tell you the description");
        String n = ob.nextLine();

        switch (n) {
            case "Mango":
                System.out.println("Entered fruit is Mango, color yellow, season summer.");
                break;
            case "Apple":
                System.out.println("Entered fruit is Apple, color red, season all, best in jammu.");
                break;

            case "cherry":
                System.out.println("Entered fruit is cherry, color redish, season all, loved by Ria.");
                break;
            default:
                System.out.println("No match found in database to tell.....");

        }
    }

}
