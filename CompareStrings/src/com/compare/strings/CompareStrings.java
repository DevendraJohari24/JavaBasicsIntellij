package com.compare.strings;

import javax.swing.*;

public class CompareStrings {
    public static void main(String[] args) {
        String name1 = JOptionPane.showInputDialog("Please Enter Name 1 : ");
        String name2 = JOptionPane.showInputDialog("Please Enter name 2 : ");

        if (name1.equals(name2)) //(name1.compareTo(name2) ==0)
        {
            System.out.println(" name 1 is equal to name 2 ");
        }
        else
        {
            System.out.println("name 1 is not equal to name 2 ");
        }
        if (name1.compareTo(name2) > 0)
        {
            System.out.println("name1 is second and name2 is first ");
        }
        if (name1.compareTo(name2) < 0)
        {
            System.out.println("name1 is first and name2 is second ");
        }


        System.exit(0);
    }
}
