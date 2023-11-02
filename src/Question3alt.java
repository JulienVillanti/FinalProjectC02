// -----------------------------------------------------
// Assignment 3 (Final project) - Question 3
// Written by: Julien Villanti - 2390054
// The third question was to write a program that finds the longest common substring form a series of 2 to many words, provided by a user.
// -----------------------------------------------------

import java.util.Scanner;

public class Question3alt {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter your string");
        String input = kb.next();
        System.out.println("Your input is " + input);
        kb.close();

        System.out.print("Permutations for " + input + ": ");
        generatePermutations(input);
    }

    public static void generatePermutations(String str) {
        int n = str.length();
        int totalPermutations = factorial(n);

        for (int i = 0; i < totalPermutations; i++) {
            char[] permutation = str.toCharArray();
            int temp = i;
            for (int j = 0; j < n - 1; j++) {
                int index = temp % (n - j);
                temp /= (n - j);
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

