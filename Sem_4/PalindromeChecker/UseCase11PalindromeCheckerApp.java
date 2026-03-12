/**
 * ============================================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * ============================================================================
 * * Use Case 11: Object-Oriented Palindrome Service
 * * Description:
 * This class demonstrates palindrome validation using
 * object-oriented design.
 * * The palindrome logic is encapsulated inside a
 * PalindromeService class.
 * * This improves:
 * - Reusability
 * - Readability
 * - Separation of concerns
 * * @author RishabhSanghai
 * @version 11.0
 */
public class UseCase11PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String testString = "racecar";

        System.out.println("--- UC11: Object-Oriented Palindrome Service ---");
        System.out.println("Testing String: \"" + testString + "\"");

        // 1. Create an instance (object) of our service class
        PalindromeService service = new PalindromeService();

        // 2. Call the encapsulated method
        boolean isPalindrome = service.checkPalindrome(testString);

        if (isPalindrome) {
            System.out.println("Result: It IS a valid palindrome!");
        } else {
            System.out.println("Result: It is NOT a valid palindrome.");
        }
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     * * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {

        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false; // Mismatch found
            }
            start++;
            end--;
        }
        return true; // All characters matched
    }
}