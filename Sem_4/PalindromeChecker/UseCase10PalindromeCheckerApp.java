/**
 * ============================================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * ============================================================================
 * * Use Case 10: Normalized Palindrome Validation
 * * Description:
 * This class validates a palindrome after preprocessing the input string.
 * * Normalization includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 * * This ensures the palindrome check is logical rather than character-format dependent.
 * * Example:
 * "A man a plan a canal Panama"
 * * @author RishabhSanghai
 * @version 10.0
 */
public class UseCase10PalindromeCheckerApp {

    /**
     * Application entry point for UC10.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Test string with spaces, capitals, and punctuation
        String input = "A man a plan a canal Panama";

        System.out.println("--- UC10: Normalized Palindrome Checker ---");
        System.out.println("Original String: \"" + input + "\"");

        // STEP 1: Normalize the string (Remove spaces/symbols and make lowercase)
        // The regex "[^a-zA-Z0-9]" replaces anything that is NOT a letter or number with nothing ""
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        System.out.println("Normalized String: \"" + normalized + "\"");

        // STEP 2: Apply the Half-Length logic to the clean string
        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {
            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break; // Stop checking as soon as a mismatch is found
            }
        }

        // Output the final result
        if (isPalindrome) {
            System.out.println("Result: It IS a valid palindrome!");
        } else {
            System.out.println("Result: It is NOT a valid palindrome.");
        }
    }
}