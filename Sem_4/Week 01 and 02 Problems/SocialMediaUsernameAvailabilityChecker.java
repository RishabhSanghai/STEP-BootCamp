import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UsernameChecker {

    // 1. Basic map for O(1) lookups (Username -> UserId)
    private HashMap<String, Integer> registeredUsers;

    // 2. Basic map to track frequencies (Username -> Count)
    private HashMap<String, Integer> attemptFrequencies;

    // 3. Simple variables to track the most attempted username
    private String mostAttemptedUsername;
    private int maxAttempts;

    public UsernameChecker() {
        registeredUsers = new HashMap<>();
        attemptFrequencies = new HashMap<>();
        mostAttemptedUsername = null;
        maxAttempts = 0;
    }

    /**
     * Helper method to simulate users already in the system.
     */
    public void registerUser(String username, int userId) {
        registeredUsers.put(username, userId);
    }

    /**
     * Checks if a username is available in O(1) time and tracks attempt frequency.
     */
    public boolean checkAvailability(String username) {
        // Get the current count (default to 0 if not found), then add 1
        int currentCount = attemptFrequencies.getOrDefault(username, 0) + 1;
        attemptFrequencies.put(username, currentCount);

        // Update the global "most attempted" tracker if this username takes the lead
        if (currentCount > maxAttempts) {
            maxAttempts = currentCount;
            mostAttemptedUsername = username;
        }

        // Return true if the username is NOT in the registered users map
        return !registeredUsers.containsKey(username);
    }

    /**
     * Suggests similar available usernames by appending numbers.
     */
    public List<String> suggestAlternatives(String username) {
        List<String> suggestions = new ArrayList<>();
        int suffix = 1;
        int maxSuggestions = 3;

        // Keep generating names until we have 3 valid suggestions
        while (suggestions.size() < maxSuggestions) {
            String candidate = username + suffix;

            // Check if the candidate is available in O(1) time
            if (!registeredUsers.containsKey(candidate)) {
                suggestions.add(candidate);
            }
            suffix++;
        }

        return suggestions;
    }

    /**
     * Returns a formatted string of the most attempted username.
     */
    public String getMostAttempted() {
        if (mostAttemptedUsername != null) {
            return "\"" + mostAttemptedUsername + "\" (" + maxAttempts + " attempts)";
        }
        return "None";
    }

    // --- Sample Usage (Main Method) ---
    public static void main(String[] args) {
        UsernameChecker checker = new UsernameChecker();

        // Simulating existing users
        checker.registerUser("john_doe", 101);
        checker.registerUser("jane_smith_taken", 102);

        // 1. Check availability
        System.out.println("checkAvailability(\"john_doe\") -> " + checker.checkAvailability("john_doe")); // false
        System.out.println("checkAvailability(\"jane_smith\") -> " + checker.checkAvailability("jane_smith")); // true

        // Simulating multiple attempts for "admin"
        for (int i = 0; i < 10543; i++) {
            checker.checkAvailability("admin");
        }

        // 2. Suggest alternatives
        System.out.println("suggestAlternatives(\"john_doe\") -> " + checker.suggestAlternatives("john_doe"));

        // 3. Get most attempted
        System.out.println("getMostAttempted() -> " + checker.getMostAttempted());
    }
}