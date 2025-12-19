import java.util.Scanner;

public class BillDiscount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of product you want to purchase: ");
        int n = sc.nextInt();

        double totalPrize = 0.0;

        System.out.println("Enter Your prize of each product here:  ");
        for (int i = 1; i <= n; i++) {
            System.out.println("Entered product no. " + i);
            double prize = sc.nextDouble();
            totalPrize += prize;
        }

        System.out.println("Total prize of the all product is: " + totalPrize);
        // discount 10% dena hai
        double setDis = 10;

        double discountAmount = setDis / 100 * totalPrize;
        System.out.println("Today you SAVED huge AMOUNT: " + discountAmount);

        double AmountAfterDiscount = totalPrize - discountAmount;
        System.out.println("Amount after discount: " + AmountAfterDiscount);

        double gst = AmountAfterDiscount * 18 / 100;
        double finalAmount = AmountAfterDiscount + gst;
        System.out.println("18% GST applicable on this amount: " + gst);
        System.out.println("Amount payable to resturant including GST is: " + finalAmount);

    }

}
