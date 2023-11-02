// -----------------------------------------------------
// Assignment 3 (Final project) - Question 4
// Written by: Julien Villanti - 2390054
// The third question was to write a program that uses an algorithm to print all the valid (properly closed and open brackets)
// combinations of a number of parentheses taken from the user.
// -----------------------------------------------------

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number:  ");
        int num = kb.nextInt();
        System.out.println("Your input is: " + num);
        kb.close();

        System.out.println("Output: " + num);

        generateParentheses(num, num, "");

    }

    //Creating a recursive method to create and print every combination of parentheses
    public static void generateParentheses(int open, int close, String current) {
        //The method will take 3 parameters: open, close and current.


        if (open == 0 && close == 0) {
            System.out.println(current);
            return;
        }


        if (open > 0) {
            generateParentheses(open - 1, close, current + "(");
        }


        if (close > open) {
            generateParentheses(open, close - 1, current + ")");
        }
    }
}

