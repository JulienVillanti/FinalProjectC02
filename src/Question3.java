import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input;
        System.out.println("Please enter your string");
        input = kb.next();

        System.out.println("Here are your string permutations: ");
        generatePermutations(input, 0);
        kb.close();
    }

    public static void generatePermutations(String str, int currentIndex) {
        if (currentIndex == str.length() - 1) {
            System.out.print(", " + str);
            return;
        }

        for (int i = currentIndex; i < str.length(); i++) {
            str = swap(str, currentIndex, i);
            generatePermutations(str, currentIndex + 1);
            str = swap(str, currentIndex, i); // Backtrack
        }
    }

    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }
}

