import java.util.Scanner;

public class String_whiteSpaceRemove {
    public static void main(String[] args) {
        System.out.println("Enter The String");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] ch = a.toCharArray();
        String s = "";
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ')
            {
                s=s+ch[i];
            }
        }
        System.out.println(s);
    }
}
