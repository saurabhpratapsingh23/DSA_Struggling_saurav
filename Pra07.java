public class Pra07 {
    public static void main(String[] args) {
        int dig = 78;

        int sum = 0, pro = 1;

        for (int i = 0; i < dig; i++) {
            int rem = dig % 10;
            sum += rem;
            pro *= rem;
            dig = dig / 10;

        }
        System.out.println("sum: " + sum + "Product: " + pro);
        int res = pro - sum;
        System.out.println(res);
    }

}
