import java.util.Scanner;

public class Pyramid_5 {
    public static void main(String[] args) {
        System.out.println("Enter No of Row");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rowCount=a;
        for (int i=0;i<a;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=rowCount;j++)
            {
                System.out.print(j+" ");
            }
            for (int j=rowCount-1;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
            rowCount--;
        }
    }
}
