// -----------------------------------------------------
// Assignment 3 (Final project) - Question 3
// Written by: Julien Villanti - 2390054
// The third question was to write a program that uses a method/algorithm to compute all permutations of a string that is taken from the user via the scanner
// -----------------------------------------------------

import java.util.Scanner;

public class q3alt3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter your string");
        String str = kb.next();
        System.out.println("Your input is " + str);
        int n = str.length();
        q3alt3 permutation = new q3alt3();

        System.out.println("Permutations for " + str + ": ");
        permutation.generatePermutation(str, 0, n - 1);
        kb.close();
    }

    private void generatePermutation(String str, int left, int right) {
        if (left == right)
            System.out.print(str + ", ");
        else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                generatePermutation(str, left + 1, right);
                str = swap(str, left, i);
            }
        }
    }
    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}


