import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        System.out.println("Enter Mobile No");
        Scanner sc=new Scanner(System.in);
        try
        {
            int a=sc.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("Enter A Valid mobile NO");
        }
    }
}
