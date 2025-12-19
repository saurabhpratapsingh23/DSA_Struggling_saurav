public class Pra17 {
    public static void main(String[] args) {
        // char ch1 = 'a';
        // char ch2 = 'z';

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            System.out.printf(" %c", ch);
        }

        System.out.println((char) ('Z' + 32));
    }

}
