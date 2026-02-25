import java.util.Stack;

/**
 * =============================================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * =============================================================================
 * Use Case 5: Stack Based Palindrome Checker
 * * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 * * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result
 * * This maps stack behavior to reversal logic.
 * * @author RishabhSanghai
 * @version 5.0
 */
public class UseCase5PalindromeCheckerApp {

    /**
     * Application entry point for UC5.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // 1. Declare and initialize the input string
        String input = "noon";

        // 2. Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // 3. Push each character of the string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // 4. Assume palindrome initially
        boolean isPalindrome = true;

        // 5. Iterate again through original string and compare with popped values
        for (char c : input.toCharArray()) {
            // Pop gives characters in reverse order
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // 6. Output the result
        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}