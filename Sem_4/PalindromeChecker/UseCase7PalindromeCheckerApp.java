import java.util.ArrayDeque;
import java.util.Deque;

/**
 * =============================================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * =============================================================================
 * Use Case 7: Deque Based Optimized Palindrome Checker
 * * Description:
 * This class validates a palindrome using a Deque (Double Ended Queue).
 * * Characters are inserted into the deque and then compared by removing
 * elements from both ends:
 * - removeFirst()
 * - removeLast()
 * * This avoids reversing the string and provides an efficient front-to-back
 * comparison approach.
 * * @author RishabhSanghai
 * @version 7.0
 */
public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        // 1. Define the input string to validate
        String input = "refer"; //

        // 2. Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>(); //

        // 3. Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c); //
        }

        // 4. Flag to track palindrome result
        boolean isPalindrome = true; //

        // 5. Continue comparison while more than one element exists
        // If 0 or 1 elements remain, it is naturally a palindrome.
        while (deque.size() > 1) { //
            // Remove from both ends and compare
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        // 6. Display the final result
        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}