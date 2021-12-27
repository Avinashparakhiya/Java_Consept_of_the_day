import java.util.Scanner;

public class Aramstrong_number {

        public static void main(String[] args) {
            System.out.println("Enter The Number");
            Scanner sc=new Scanner(System.in);
            int digit=1;
            int number=sc.nextInt();
            String a=String.valueOf(number);
            int b=a.length();
//            int number = 371;
                   int originalNumber, remainder, result = 0;

            originalNumber = number;
            while (originalNumber != 0)
            {
                remainder = originalNumber % 10;
                result += Math.pow(remainder, b);
                originalNumber /= 10;
            }

            if(result == number)
                System.out.println(number + " is an Armstrong number.");
            else
                System.out.println(number + " is not an Armstrong number.");
        }
    }

