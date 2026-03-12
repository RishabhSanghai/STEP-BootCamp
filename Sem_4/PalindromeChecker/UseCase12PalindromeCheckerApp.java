/**
 * ============================================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ============================================================================
 * * Use Case 12: Strategy Pattern for Palindrome Algorithms
 * * Description:
 * This class demonstrates how different palindrome validation algorithms
 * can be selected dynamically at runtime using the Strategy Design Pattern.
 * * @author RishabhSanghai
 * @version 12.0
 */
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {
        String testString = "madam";
        System.out.println("--- UC12: Strategy Pattern Validator ---");
        System.out.println("Testing String: \"" + testString + "\"\n");

        // 1. Inject and use the Stack Strategy
        PalindromeStrategy stackStrategy = new StackStrategy();
        System.out.println("Using Stack Strategy: " + stackStrategy.check(testString));

        // 2. Inject and use the Deque Strategy dynamically
        PalindromeStrategy dequeStrategy = new DequeStrategy();
        System.out.println("Using Deque Strategy: " + dequeStrategy.check(testString));
    }
}

/**
 * ============================================================================
 * INTERFACE - PalindromeStrategy
 * ============================================================================
 * This interface defines a contract for all palindrome checking algorithms.
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * ============================================================================
 * CLASS - StackStrategy
 * ============================================================================
 * Implements palindrome validation using a Stack (LIFO).
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {
        // Create a stack to store characters.
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character of the input string onto the stack.
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack.
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

/**
 * ============================================================================
 * CLASS - DequeStrategy
 * ============================================================================
 * Implements palindrome validation using a Deque (Bidirectional).
 */
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {
        java.util.Deque<Character> deque = new java.util.LinkedList<>();

        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}