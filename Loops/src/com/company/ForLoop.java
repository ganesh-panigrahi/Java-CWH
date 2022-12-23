package com.company;

public class ForLoop {
    public static void main(String[] args) {
//        Syntax of for loop:-
//        for (initialization; boolean returning expression; Updation) {
//            Body of loop in which statements to executed are written
//        }
        for(int a = 0; a <= 10; a++) {
            System.out.println(a);
        }

//        Even Numbers = 2n
//        Odd numbers = 2n+1

//        Print first 5 odd numbers
        for (int i = 0; i < 5; i++) {
            System.out.println(2*i+1);
        }
    }
}
