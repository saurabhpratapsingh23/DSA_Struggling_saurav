public class Pra08 {

    public static void main(String[] args) {

        // there is String ab2h3hg3yt4 extract only alphabet from this String.

        String str = "ab2h3hg3yt4vh";
        String store = "";

        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // ek he line m khatam hai khel
        String inOneLineOutput = str.replaceAll("[^a-zA-Z]", "");
        System.out.println("Complete the code in Single Line: " + inOneLineOutput);

        // Dusra method bhai ye!!

        for (int i = 0; i <= clean.length() - 1; i++) {
            if (clean.charAt(i) >= 'a' && clean.charAt(i) <= 'z') {
                store += clean.charAt(i);
                // continue;
            }
        }

        System.out.println("your filtered String is: " + store);

    }

}
