import java.util.Scanner;

public class FirstNonRepeatingChar {

    public static char findFirstNonRepeating(String text) {
        int[] charFrequencies = new int[256];

        for (int i = 0; i < text.length(); i++) {
            charFrequencies[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            if (charFrequencies[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        char firstChar = findFirstNonRepeating(text);

        if (firstChar != '\0') {
            System.out.println("The first non-repeating character is: " + firstChar);
        } else {
            System.out.println("There are no non-repeating characters in the string.");
        }
        scanner.close();
    }
}
