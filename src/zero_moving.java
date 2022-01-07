import java.util.Arrays;
import java.util.Scanner;

public class zero_moving {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 0, 0, 22, 0, 22, 56};
        int[] b = new int[a.length];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                b[index] = a[i];
                index++;

            }
        }
        System.out.println(Arrays.toString(b));
    }
}
