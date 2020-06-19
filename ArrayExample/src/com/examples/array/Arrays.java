package com.examples.array;

public class Arrays {
    public static void main(String[] args) {
        int  [] numbers = new int[4];

        //int numbers2 [] = new int [10];

        //int [] numbers3,numbers4,numbers5 ;
        //int numbers[] ,numbers7[] ,numbers8[] ;
        int [] numbers2 = {10,15,20,25}; //declaration

        for (int i=0 ; i< numbers2.length ; i++)
        {
            System.out.println(numbers2[i]);
        }
        for (int val : numbers2)
        {
            System.out.println(val);
        }
    }
}
