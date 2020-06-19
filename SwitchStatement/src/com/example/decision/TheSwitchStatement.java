package com.example.decision;

import javax.swing.*;
import java.awt.*;

public class TheSwitchStatement {
    public static void main(String[] args) {
        int number ;
        String input = JOptionPane.showInputDialog("Please enter 1 , 2 or 3 : ");
        number = Integer.parseInt(input);

        switch (number)
        {
            case 1 :
                JOptionPane.showMessageDialog(null,"Number is 1");
                break;
            case 2 :
                JOptionPane.showMessageDialog(null,"Number is 2");
                break;
            case 3 :
                JOptionPane.showMessageDialog(null,"Number is 3");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Number is " + number);
        }

        char letter ;
        input = JOptionPane.showInputDialog("Please Enter a , b  or c : ");
        letter = input.charAt(0);
        
        switch (letter)
        {
            case 'a' :
                JOptionPane.showMessageDialog(null, "You Entered a");
                break;
            case 'b' :
                JOptionPane.showMessageDialog(null, "You Entered b");
                break;
            case 'c' :
                JOptionPane.showMessageDialog(null, "You Entered c");
                break;
            default:
                JOptionPane.showMessageDialog(null,"You entered other than a , b , c ");
        }

        System.exit(0);

    }
}
