import java.util.Scanner;

class Pyramind_1 {
    public static void main(String[] args) {
        System.out.println("Enter The Number of Row");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rowCout=1;

        for (int i=a;i>0;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }

            for (int j=1;j<=rowCout;j++)
            {
                System.out.print(rowCout+" ");
            }

            System.out.println();
            rowCout++;
        }
    }
}
