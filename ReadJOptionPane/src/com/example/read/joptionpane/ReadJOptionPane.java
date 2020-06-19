package com.example.read.joptionpane;

import javax.swing.*;

public class ReadJOptionPane {
    public static void main(String[] args) {
        String name;
        String surname;


        name = JOptionPane.showInputDialog("Please Enter Your Name : ");

        surname = JOptionPane.showInputDialog("Please Enter Your surname : ");

        JOptionPane.showMessageDialog(null , name + " " + surname);

        int firstNumber ; // double firstNumber ;
        int secondNumber ;
        String input ;

        input = JOptionPane.showInputDialog("Please Enter the first Number : ");
        firstNumber = Integer.parseInt(input); // Double.parseInt(input);

        input = JOptionPane.showInputDialog("Please Enter the Second Number : ");
        secondNumber = Integer.parseInt(input);

        double average = (firstNumber + secondNumber) / 2.0 ;
        JOptionPane.showMessageDialog(null,"Average : " + average );

    }
}
