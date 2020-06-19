package com.example.methods;

public class Methods {
    public static void main(String[] args) {
        System.out.println("This is a void method !");

       //int number = Integer.parseInt("700")

        printaverage(20,30);
        double average = getaverage(30,30);
        System.out.println("Average : " + average);
    }

    public static void printaverage(int val1 , int val2)
    {
        double average = (val1 + val2) /2.0;
        System.out.println("Average " + average);
    }
    public static double getaverage(int val1 , int val2)
    {
        double average = (val1 + val2) /2.0;
        return average;
    }
}
