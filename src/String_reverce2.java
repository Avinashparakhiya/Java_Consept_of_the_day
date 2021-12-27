//for loop

public class String_reverce2 {
    public static void main(String[] args) {
        String str="avinash";
        char []ch=str.toCharArray();
        for (int i=str.length()-1;i>=0;i--)
        {
            System.out.print(ch[i]);
        }
    }
}
