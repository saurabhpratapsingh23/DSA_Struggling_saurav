class tryingJ {
    int f = 5;

    public int add(int a, int b) {
        return a + b;

    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }

}

public class Calc {

    public static void main(String args[]) {

        int a = 5;
        int b = 12;

        tryingJ t = new tryingJ();
        // tryingJ b = new tryingJ();
        int g = t.f;
        int result = t.add(a, b);
        System.out.println(result);
        System.out.println(g);

    }

}