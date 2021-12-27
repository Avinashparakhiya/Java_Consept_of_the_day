import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class String_anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The First Word");
        String a=sc.nextLine();
        System.out.println("Enter Second Word");
        String b=sc.nextLine();

        anagram(a,b);
    }

    public static void anagram(String s1,String s2)
    {
        String a=s1.replaceAll("\\s","").toUpperCase();
        String b=s2.replaceAll("\\ss","").toUpperCase();

        boolean status=true;
        if (a.length()!=b.length())
        {
            System.out.println(a+" and "+b+" is not a anagram");
        }
        else if (a.length()==b.length())
        {
            char[]aa=a.toCharArray();
            char[]bb=b.toCharArray();
            Arrays.sort(aa);
            Arrays.sort(bb);
            status=Arrays.equals(aa,bb);
            System.out.println(status+"yes");
        }
    }
}
