/**
 * =============================================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * =============================================================================
 * * Use Case 4: Character Array Based Validation
 * * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 * * At this stage, the application:
 * - Converts string to char array
 * - Uses start and end pointers
 * - Compares characters efficiently
 * - Displays the result
 * * This reduces extra memory usage.
 * * @author RishabhSanghai
 * @version 4.0
 */
public class UseCase4PalindromeCheckerApp {

    /**
     * Application entry point for UC4.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // 1. Declare and initialize the input string
        String input = "radar";

        // 2. Convert string into a character array
        char[] chars = input.toCharArray();

        // 3. Initialize pointers (Two-Pointer Technique)
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        // 4. Continue comparison until pointers cross
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break; // Exit if mismatch found
            }
            start++; // Move forward
            end--;   // Move backward
        }

        // 5. Output result
        System.out.println("Input: " + input);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}