import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * =============================================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * =============================================================================
 * Use Case 6: Queue + Stack Fairness Check
 * * Description:
 * This class demonstrates palindrome validation using
 * two different data structures:
 * - Queue (FIFO - First In First Out)
 * - Stack (LIFO - Last In First Out)
 * * Characters are inserted into both structures and then
 * compared by removing from the front of the queue and
 * the top of the stack.
 * * @author RishabhSanghai
 * @version 6.0
 */
public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        // 1. Define the input string to validate
        String input = "civic";

        // 2. Create a Queue (FIFO) and a Stack (LIFO)
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // 3. Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);  // Enqueue
            stack.push(c); // Push
        }

        // 4. Flag to track palindrome status
        boolean isPalindrome = true;

        // 5. Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {
            // dequeue() vs pop()
            // Queue returns the FIRST char ('c'), Stack returns the LAST char ('c')
            if (queue.poll() != stack.pop()) {
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