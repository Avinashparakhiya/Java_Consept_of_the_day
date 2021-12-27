import java.util.Scanner;

public class sum_ofNumber {
    public static void main(String[] args) {
        System.out.println("Please Enter The Number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        int i=1;
        while (a!=0)
        {
            int lastdigit=a%10;

            sum=sum+lastdigit;

            a=a/10;

        }
        System.out.println(sum);
    }
}
