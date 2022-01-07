import java.util.Scanner;

public class String_Rotation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The first String");
        String a=sc.nextLine();
        System.out.println("Enter The Second string");
        String b=sc.nextLine();
        if (a.length()!=b.length())
        {
            System.out.println("String is Not same");
        }
        else
        {
            String c=a+b;
            if (c.contains(b))
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }
    }
}
