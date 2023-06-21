package com.InternshipFlipRobo;

//creating class
class Example {
    //Defining Variable
    public String name;
    public int number;

//Creating getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void printDetails() {
        System.out.println("My name is: " + this.getName());
        System.out.println("My Number is: " + this.getNumber());
    }
}

public class Worksheet3_Q20 {
    public static void main(String[] args) {
        System.out.println("Hello sir, This is my submission for worksheet 3 Question 20");

        Example objE =new Example();
        objE.setName("Abhishek");
        objE.setNumber(5);

        objE.printDetails();
    }
}
