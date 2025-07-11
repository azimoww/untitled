package untitled.stringlesson;
import java.util.Scanner;
public class stringCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        if (text.length() < 4) {
            System.out.println("The string must be at least 4 characters long.");
        } else {
            System.out.println("Length: " + text.length());
            char firstChar = text.charAt(0);
            System.out.println("First character: " + firstChar);
            String lastFour = text.substring(text.length() - 4);
            System.out.println("Last 4 characters: " + lastFour);
            char lastOfFour = lastFour.charAt(3);
            if (firstChar == lastOfFour) {
                System.out.println("First character equals the last of the last 4 characters.");
            } else {
                System.out.println("First character does NOT equal the last of the last 4 characters.");
            }
        }

        scanner.close();
    }
}