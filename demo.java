class Animal {

    public void sound() {
        System.out.println("Animal makes a sound");
    }

    public String nameAnimal(String n) {
        return "Animal name is: " + n;
    }

}

public class demo {

    public static void main(String args[]) {
        String sa = "Lion";
        int arr[][] = new int[3][3];
        Animal ob = new Animal();
        ob.sound();
        String res = ob.nameAnimal(sa);
        System.out.println(res);
        System.out.println(arr[2][3]);

    }
}