/**
 * ============================================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ============================================================================
 * * Use Case 13: Performance Comparison
 * * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 * * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 * * This use case focuses purely on performance
 * measurement and algorithm comparison.
 * * @author RishabhSanghai
 * @version 13.0
 */
public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {
        // Test string (using the one from your screenshot)
        String input = "level";

        System.out.println("--- UC13: Performance Comparison ---\n");

        // ==========================================
        // ALGORITHM 1: Two-Pointer Approach (Fast)
        // ==========================================
        long startTime1 = System.nanoTime(); // Start the timer
        boolean isPal1 = checkTwoPointer(input); // Run the logic
        long endTime1 = System.nanoTime(); // Stop the timer
        long duration1 = endTime1 - startTime1; // Calculate duration

        System.out.println("Algorithm: Two-Pointer (Manual Traversal)");
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPal1);
        System.out.println("Execution Time : " + duration1 + " ns\n");

        // ==========================================
        // ALGORITHM 2: StringBuilder Approach (Heavier)
        // ==========================================
        long startTime2 = System.nanoTime(); // Start the timer
        boolean isPal2 = checkStringBuilder(input); // Run the logic
        long endTime2 = System.nanoTime(); // Stop the timer
        long duration2 = endTime2 - startTime2; // Calculate duration

        System.out.println("Algorithm: StringBuilder (Object Creation)");
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPal2);
        System.out.println("Execution Time : " + duration2 + " ns");
    }

    /**
     * Highly efficient manual array traversal.
     */
    public static boolean checkTwoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * Less efficient as it creates a new String and StringBuilder object in memory.
     */
    public static boolean checkStringBuilder(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}