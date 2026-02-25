import java.util.LinkedList;

/**
 * =============================================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * =============================================================================
 * Use Case 8: Linked List Based Palindrome Checker
 * * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList.
 * * Characters are added to the list and then compared
 * by removing elements from both ends:
 * - removeFirst()
 * - removeLast()
 * * This demonstrates how LinkedList supports
 * double-ended operations for symmetric validation.
 * * @author RishabhSanghai
 * @version 8.0
 */
public class UseCase8PalindromeCheckerApp {

    /**
     * Application entry point for UC8.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // 1. Define the input string
        String input = "level"; //

        // 2. Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>(); //

        // 3. Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.add(c); //
        }

        // 4. Flag to track palindrome state
        boolean isPalindrome = true; //

        // 5. Compare until only one or zero elements remain
        while (list.size() > 1) { //
            // LinkedList allows double-ended removal
            if (list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        // 6. Display results
        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}