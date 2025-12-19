import java.util.Arrays;

public class Pra16 {
    public static void main(String[] args) {
        int[] arr = { 12, 51, 84, 65, 02, 64 };

        System.out.println(Arrays.toString(arr));
        swap(arr, 2, 5);

        System.out.println(Arrays.toString(arr));
        // for (int num : arr) {
        // System.out.print(num);
        // }

    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}