package com.example.calculations;

import javax.swing.*;
import java.text.DecimalFormat;

public class RunningTotals {
    public static void main(String[] args) {
        int days ;
        double sales ;
        double totalSales = 0.0;

        DecimalFormat dollar = new DecimalFormat("#,##0.00");

        String input = JOptionPane.showInputDialog("For How many days do you have sales " + "figures");
        days = Integer.parseInt(input);

        for(int count = 1 ; count <=days ; count++)
        {
            input = JOptionPane.showInputDialog("Enter the sales for day" + count );
            sales = Double.parseDouble(input);
            totalSales = totalSales + sales ;
        }

        JOptionPane.showMessageDialog(null,"Total Sales : $" + dollar.format(totalSales));

        System.exit(0);
    }
}
