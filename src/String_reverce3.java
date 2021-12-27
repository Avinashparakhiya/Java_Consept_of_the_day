//recursion

public class String_reverce3 {
    public static void main(String[] args) {
        String str = "avinash";

        String ans = reverse_String(str);
        System.out.println(ans);

    }

    static String reverse_String(String str) {
        if ((null == str || (str.length() <= 1))) {
            return str;
        }
        return (reverse_String(str.substring(1)) + str.charAt(0));
    }
}

