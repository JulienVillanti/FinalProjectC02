// -----------------------------------------------------
// Assignment 3 (Final project) - Question 3
// Written by: Julien Villanti - 2390054
// The third question was to write a program that uses a method/algorithm to compute all permutations of a string that is taken from the user via the scanner
// -----------------------------------------------------

import java.util.Scanner;

public class Question3alt {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter your string");
        String input = kb.next();
        System.out.println("Your input is " + input);
        kb.close();

        System.out.println("Permutations for " + input + ": ");
        generatePermutations(input);
    }

    public static void generatePermutations(String str) {
        int n = str.length();
        int totalPermutations = factorial(n);

        //Outer loops is iterating form 0 to 'totalPermutations -1'.Generates all permutations of the input string.
        for (int i = 0; i < totalPermutations; i++) {

            //creates a character array called permutation with characters of the input string.
            char[] permutation = str.toCharArray();
            int temp = i;

            //inner loop for the individual permutation
            for (int j = 0; j < n - 1; j++) {
                int index = temp % (n - j);
                temp = temp / (n - j);
                char tempChar = permutation[j + index];
                for (int k = j + index; k > j; k--) {
                    permutation[k] = permutation[k - 1];
                }
                permutation[j] = tempChar;
            }

            System.out.print(new String(permutation));
            if (i < totalPermutations - 1) {
                System.out.print(", ");
            }
        }
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

