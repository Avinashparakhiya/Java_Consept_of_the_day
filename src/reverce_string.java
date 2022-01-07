import java.util.Scanner;

public class reverce_string {

        public static void main(String[] args){
            System.out.println("Enter A string");

            Scanner sc=new Scanner(System.in);
            String inputString=sc.nextLine();
            String[] words = inputString.split(" ");

            String reverseString = "";

            for (int i = 0; i < words.length; i++)
            {
                String word = words[i];

                String reverseWord = "";

                for (int j = word.length()-1; j >= 0; j--)
                {
                    reverseWord = reverseWord + word.charAt(j);
                }

                reverseString = reverseString + reverseWord + " ";
            }

            System.out.println(reverseString);
        }
}
