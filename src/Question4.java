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

    public static void generateParentheses(int open, int close, String current) {
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