package com.example;

public class Variables_Literals_Constants {
    public static void main(String[] args) {
        final int firstNumber;
        int secondNumber;

        firstNumber = 11;
        secondNumber = 20;
        double average ;
        average = (double) (firstNumber+secondNumber)/2.0;
        System.out.println("Average: " + average);

        String name;
        String surname;

        name = "Devendra" ;
        surname = "Johari" ;

        System.out.println(name + " " + surname);

        boolean value ;
        value = true ;
        System.out.println(value);

        char letter ;
        letter = 'j'; //letter = 10;

        System.out.println(letter);

    }
}
