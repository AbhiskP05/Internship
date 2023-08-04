package com.InternshipFlipRobo;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner Sc1 = new Scanner(System.in);
        System.out.println("Enter Number to check Palindrome");
        int num = Sc1.nextInt();
        int n = num;     //copy the value
        int s = 0;
        int m;
        while (n > 0) {
            m = n % 10;
            s = (s * 10) + m;
            n = n / 10;
        }
        if (s == num)
            System.out.println("The Number " + num + " is Palindrome");
        else
            System.out.println("The Number "+ num + "is not Palindrome");
    }
}