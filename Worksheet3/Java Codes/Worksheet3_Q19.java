package com.InternshipFlipRobo;

class Addition {
    int sum=0;
    public int addTwoInt(int x, int y) {
        this.sum=x+y;
        return sum;
    }
}

public class Worksheet3_Q19 {
    public static void main(String[] args) {
        //Creating object of class Addition
        System.out.println("Hello sir, This is my submission code for worksheet 3 Question 19 ");
        Addition objA= new Addition();

        //Calling the method and Print the object

        System.out.println("The sum of X=12 and Y=34 is " + objA.addTwoInt(12,34));
    }
}
