package com.reading.input.scanner;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        int firstNumber ;
        int secondNumber ;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please Enter the first number : ");
        firstNumber = keyboard.nextInt() ;
        System.out.println("Please Enter the second number : ");
        secondNumber = keyboard.nextInt() ;

        double average = (double)(firstNumber+secondNumber) /2 ;
        System.out.println("Average : " + average);


        String name ;
        String surname ;

        keyboard.nextLine(); // THis is important whenever i used nextint or something else and after it we used next line we have to add new nextline()  otherwise it creates a problem
        System.out.println("Please Enter your name : ");
        name = keyboard.nextLine();

        System.out.println("Please Enter your surname : ");
        surname =keyboard.nextLine();

        System.out.println(name + " " + surname);


    }
}
