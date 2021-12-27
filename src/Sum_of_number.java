import java.util.Scanner;

public class Sum_of_number {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Please Enter The Number");
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int x = 0;
        int y = 0;


        for (int i = 0; i < a.length; i++) {
            x = sum - a[i];
            if (x+a[i]==sum)
            {
                System.out.println(x + " " + a[i]);
            }
        }
    }
}