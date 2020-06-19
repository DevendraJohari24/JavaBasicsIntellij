package com.example.textfiles;


import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFromFiles {
    public static void main(String[] args) throws IOException {
        File file = new File("OutputFile.txt");

        if (file.exists())
        {
            Scanner inputFile = new Scanner(file) ;

            while(inputFile.hasNext()) //check where the end of file
            {
                System.out.println(inputFile.nextLine());
            }

            inputFile.close();
        }
        else {
            JOptionPane.showMessageDialog(null,"File does not exist ");

        }

    }


}
