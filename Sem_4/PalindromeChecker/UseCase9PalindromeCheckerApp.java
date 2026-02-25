/**
 * =============================================================================
 * MAIN CLASS - UseCase9RecursivePalindrome
 * =============================================================================
 * Use Case 9: Recursive Palindrome Checker
 * * Description:
 * This class validates a palindrome using recursion.
 * * Characters are compared from the outer positions
 * moving inward using recursive calls.
 * * The recursion stops when:
 * - All characters are matched, or
 * - A mismatch is found.
 * * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 * * @author RishabhSanghai
 * @version 9.0
 */
public class UseCase9PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "malayalam";

        // Initial call with start index 0 and end index at the last character
        boolean isPalindrome = check(input, 0, input.length() - 1);

        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }

    /**
     * Recursively checks whether a string is palindrome.
     * * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // Base Condition: If pointers meet or cross, all checks passed
        if (start >= end) {
            return true;
        }

        // Check if characters at current positions match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call: move indices inward
        return check(s, start + 1, end - 1);
    }
}