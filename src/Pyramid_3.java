import java.util.Scanner;

public class Pyramid_3 {
    public static void main(String[] args) {
        System.out.println("Enter The Number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rowCount=1;
        for (int i=a;i>0;i--)
        {

            for (int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=rowCount;j++)
            {
                System.out.print(j+" ");
            }
            rowCount++;
            System.out.println();
        }

    }
}
