package com.example.decisions;

import javax.swing.*;

public class DecisionStructures {
    public static void main(String[] args) {
        int number;

        String input;

        input = JOptionPane.showInputDialog("Please Enter the number : ");
        number = Integer.parseInt(input);

        if (number == 5)
        {
            JOptionPane.showMessageDialog(null,"The number is exactly Five ");
        }

        else if (number > 5 && number < 70)
        {
            JOptionPane.showMessageDialog(null,"The number is greater than Five ");
        }

        else if (number > 10 && number < 74)
        {
            JOptionPane.showMessageDialog(null,"The number is greater than Ten");
        }
        else
        {
            if (number >= 75)
            {
                JOptionPane.showMessageDialog(null,"The number you enter is : " + number);
            }
        }

        System.exit(0);

    }
}
