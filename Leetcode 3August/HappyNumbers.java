package com.InternshipFlipRobo;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class HappyNumbers {

    public static boolean isHappyNumber(int n) {
        Set<Integer> s1=new HashSet<>();
        while(!s1.contains(n)) {
            s1.add(n);
            int sum=0;
            while(n!=0){
                int temp=n%10;
                sum+=temp*temp;
                n=n/10;
            }
            n=sum;
        }
        return n==1;
    }


    public static void main(String[] args) {
        //To get the number input by user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=sc.nextInt();

        System.out.println("Is the Number " + num + " is Happy Number " + isHappyNumber(num));
    }
}

