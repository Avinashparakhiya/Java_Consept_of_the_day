import java.sql.SQLOutput;
import java.util.Scanner;

public class Number_BinaryOrNot {
    public static void main(String[] args) {
        System.out.println("Please Enter The Number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String aa=null;
        while (a!=1)
        {
            int temp=a%10;
            if (temp>1)
            {
                System.out.println("Number Is not Binary");
                break;
            }
            else
            {
                a=a/10;
                aa="number is binary";
            }
        }
    }
}