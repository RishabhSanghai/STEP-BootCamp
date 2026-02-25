/**
 * =============================================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * =============================================================================
 * * Use Case 2: Hardcoded Palindrome Validation
 * * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 * * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 * * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 * * @author Developer
 * @version 2.0
 */
public class UseCase2PalindromeCheckerApp {

    /**
     * Application entry point for UC2.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Step 1: Store a predefined string (String Literal)
        String input = "madam";
        boolean isPalindrome = true;

        // Step 2: Fundamental comparison logic
        // Hint: Loop only till half of the string length.
        for (int i = 0; i < input.length() / 2; i++) {
            // Compare character from start (i) with character from end
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break; // Exit loop if a mismatch is found
            }
        }

        // Step 3: Display the result
        System.out.println("Input String: " + input);

        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}