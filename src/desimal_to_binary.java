import java.util.Scanner;

public class desimal_to_binary {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rem=0;
        String binary="";

        while (a>0)
        {
            rem=a%2;
            binary=rem+binary;
            a=a/2;
        }
        System.out.println(binary);
    }
}
