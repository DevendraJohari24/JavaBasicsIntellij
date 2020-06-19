package com.example.loops;

public class Loops {
    public static void main(String[] args) {
        // while loop  // pre-test loop
        int x =0 ;   //loop control variable

        while (x<5) // Condition Statement
        {
            System.out.println("Hello World");
            x = x + 1; //Updation // or x++; or x += 1
        }

        //to do-while loop // post-test loop

        int y=0; //loop control variable
        do{
            System.out.println("Hello World");
            y++; //Updation
        }while(y<5); //Condition Statement

        //for loop

        for(int i=0 ; i < 5 ;  i++ ) // (Initialisation(loop Control Variable), Condition , Updation)
        {
           System.out.println("Hello World ");
        }

        System.exit(0);



    }
}
