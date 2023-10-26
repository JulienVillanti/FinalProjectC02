import java.util.Scanner;

public class Question2 {

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


        System.out.print("Enter the number of words to compare (2 to n): ");
        int numWords = scanner.nextInt();

        if (numWords < 2) {
            System.out.println("Please enter at least two words for comparison.");
            return;
        }

        String[] words = new String[numWords];

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

