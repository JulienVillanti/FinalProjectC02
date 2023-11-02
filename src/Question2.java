// -----------------------------------------------------
// Assignment 3 (Final project) - Question 2
// Written by: Julien Villanti - 2390054
// The second question was to write a program that finds the longest common substring form a series of 2 to many words, provided by a user.
// -----------------------------------------------------

import java.util.Scanner;

public class Question2 {
    //Creating the method for the strings comparison
    public static String findLongestCommonSubstring(String[] words) {
        if (words == null || words.length < 2) {
            return "";
        }

        String firstWord = words[0];
        int maxLength = 1;
        String longestCommonSubstring = "";

        for (int i = 0; i < firstWord.length(); i++) {
            for (int j = i + 1; j <= firstWord.length() - 1; j++) {
                String substring = firstWord.substring(i, j);

                boolean isCommon = true;
                for (int k = 1; k < words.length; k++) {
                    if (!words[k].contains(substring)) {
                        isCommon = false;
                        break;
                    }
                }

                if (isCommon && substring.length() > maxLength) {
                    maxLength = substring.length();
                    longestCommonSubstring = substring;
                }
            }
        }
        return longestCommonSubstring;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numWords;
        //Prompt the user to enter the number of words they want to compare through a loop so that they enter at least 2 words to progress
        while (true) {
            System.out.print("Enter the number of words to compare (2 to n): ");
            numWords = scanner.nextInt();

            //Getting out of the loop if the number is superior to 2
            if (numWords >= 2) {
                break;
            }
            System.out.println("Please enter at least two words for comparison.");
        }

        //Creating an array to store the words entered by the user
        String[] words = new String[numWords];

        //Prompting the user to enter each word, based on the number they entered previously
        for (int i = 0; i < numWords; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            words[i] = scanner.next();
        }

        String commonSubstring = findLongestCommonSubstring(words);

        if (commonSubstring.isEmpty()) {
            System.out.println("No common substring found.");
        } else {
            System.out.println("Longest common substring: " + commonSubstring);
        }
    }
}

