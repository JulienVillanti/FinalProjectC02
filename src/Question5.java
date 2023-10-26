import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int sides = 0;
        int count;
        int perimeter = 0;


        while (sides < 7) {
            System.out.print("Length of segment " + (sides + 1) + "? ");
            count = kb.nextInt();
            sides++;
            perimeter = perimeter + count;
        }
        System.out.println("Perimeter (in cm) : " + (perimeter));
    }
}
