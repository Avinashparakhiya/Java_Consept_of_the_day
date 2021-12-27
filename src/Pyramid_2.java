//*
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * * * *
//        * * * * * * *
//        * * * * * * * *
//        * * * * * * * * *


import java.util.Scanner;

public class Pyramid_2 {
    public static void main(String[] args) {
        System.out.println("Please Enter the Number Of row");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 1;
        for (int i = a; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= count; j++) {
                System.out.print("*" + " ");
            }


            System.out.println();
            count++;
        }
        }
    }

