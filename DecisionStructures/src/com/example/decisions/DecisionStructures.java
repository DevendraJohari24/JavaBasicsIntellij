package com.example.decisions;

public class DecisionStructures {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int p = 7;

        boolean expression = x == y ;
        System.out.println(expression);

        boolean expression2 = x > y ;
        System.out.println(expression2);

        boolean expression3 = x == y && y < p ;
        System.out.println(expression3);

        boolean expression4 = x == y || y == p;
        System.out.println(expression4);


        boolean expression5 = !(x == y || y == p);
        System.out.println(expression5);
    }
}
