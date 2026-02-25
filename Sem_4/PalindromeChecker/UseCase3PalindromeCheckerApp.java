/**
 * =============================================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * =============================================================================
 * * Use Case 3: Reverse String Based Palindrome Check
 * * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 * * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 * * This introduces transformation-based validation.
 * * @author RishabhSanghai
 * @version 3.0
 */
public class UseCase3PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Step 1: Initialize the original string
        String original = "madam";
        String reversed = ""; // This will hold our reversed version

        // Step 2: Implementation of the Hint Logic
        // Iterate from the last character to the first.
        for (int i = original.length() - 1; i >= 0; i--) {
            // String Concatenation: Building the new string character by character
            reversed = reversed + original.charAt(i);
        }

        // Step 3: Compare content using equals()
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        if (original.equals(reversed)) {
            System.out.println("Result: Success! It is a palindrome.");
        } else {
            System.out.println("Result: Failed! It is not a palindrome.");
        }
    }
}