class SciCalc extends tryingJ {
    public int mul(int a, int b) {
        return a * b;
    }

    public int modu(int a, int b) {
        return a % b;
    }
}

public class Prac02 {
    public static void main(String args[]) {
        SciCalc obj = new SciCalc();
        int r1 = obj.add(23, 43);
        int r2 = obj.add(12, 43, 54);
        int r3 = obj.mul(13, 4);
        int r4 = obj.modu(43, 5);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}