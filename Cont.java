// create a constructor 

class A {
    String kro1;
    String kro2;
    String kro3;

    public A() {
        this.kro1 = "kro";
        this.kro2 = "kro2";
        this.kro3 = "kro3";
        System.out.println("hello from A.");

    }

    public A(String kro1, String kro2) {
        this.kro1 = kro1;
        this.kro2 = kro2;
        this.kro3 = "kro3...";
        System.out.println("Entered in 2 parameter const.......");
    }

    public A(String kro1, String kro2, String kro3) {
        this.kro1 = kro1;
        this.kro2 = kro2;
        this.kro3 = kro3;
        System.out.println("Entered in 3 parameter const.......");
    }

    public void display() {
        System.out.println(kro1 + kro2 + kro3);
    }
}

public class Cont {
    public static void main(String[] args) {

        A ob = new A(); // default const
        ob.display();
        A ob2 = new A("kro112", "kro223");
        ob2.display();

        A ob3 = new A("kro111", "kro222", "kro333");
        ob3.display();

        // String res2 =

        // System.out.println(res + " " + res2);
        // System.out.println();

    }
}