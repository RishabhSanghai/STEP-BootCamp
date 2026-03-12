import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UsernameChecker {

    // 1. Database of registered users (Username -> UserId)
    private HashMap<String, Integer> registeredUsers;

    // 2. Tracker for attempt frequencies (Username -> Count)
    private HashMap<String, Integer> attemptFrequencies;

    // 3. Variables to track the #1 most attempted username
    private String mostAttemptedUsername;
    private int maxAttempts;

    public UsernameChecker() {
        registeredUsers = new HashMap<>();
        attemptFrequencies = new HashMap<>();
        mostAttemptedUsername = null;
        maxAttempts = 0;
    }

    /**
     * Helper method to populate the database.
     */
    public void registerUser(String username, int userId) {
        registeredUsers.put(username, userId);
    }

    /**
     * Checks availability in O(1) time and legitimately tracks the top searched name.
     */
    public boolean checkAvailability(String username) {
        // Increment the search count for THIS specific username
        int currentCount = attemptFrequencies.getOrDefault(username, 0) + 1;
        attemptFrequencies.put(username, currentCount);

        // Legitimately update the #1 spot if this username beats the current record
        if (currentCount > maxAttempts) {
            maxAttempts = currentCount;
            mostAttemptedUsername = username;
        }

        // Return true if available (not in the database)
        return !registeredUsers.containsKey(username);
    }

    /**
     * Suggests alternatives for ANY variable passed into it.
     */
    public List<String> suggestAlternatives(String username) {
        List<String> suggestions = new ArrayList<>();
        int suffix = 1;

        // Keeps trying new numbers until it finds 3 that are NOT in the database
        while (suggestions.size() < 3) {
            String candidate = username + suffix; // Works for any name!

            if (!registeredUsers.containsKey(candidate)) {
                suggestions.add(candidate);
            }
            suffix++;
        }
        return suggestions;
    }

    /**
     * Retrieves the most attempted username and its exact count.
     */
    public String getMostAttempted() {
        if (mostAttemptedUsername != null) {
            return "\"" + mostAttemptedUsername + "\" (" + maxAttempts + " attempts)";
        }
        return "None";
    }

    // --- Main Method (The Proof) ---
    public static void main(String[] args) {
        UsernameChecker checker = new UsernameChecker();

        System.out.println("--- LOADING DATABASE ---");
        // Creating 1000 pre-existing users (user1, user2... user1000)
        for (int i = 1; i <= 1000; i++) {
            checker.registerUser("user" + i, i);
        }
        checker.registerUser("john_doe", 1001);
        checker.registerUser("batman", 1002);
        System.out.println("Database loaded with " + checker.registeredUsers.size() + " users.\n");


        System.out.println("--- TESTING SUGGESTIONS FOR ANY VARIABLE ---");

        // Variable 1: A random name that isn't in the DB
        String randomName = "super_coder";
        System.out.println("Is '" + randomName + "' taken? -> " + !checker.checkAvailability(randomName));
        System.out.println("Suggestions for '" + randomName + "': " + checker.suggestAlternatives(randomName));

        // Variable 2: A name we know is taken
        String takenName = "batman";
        System.out.println("Is '" + takenName + "' taken? -> " + !checker.checkAvailability(takenName));
        System.out.println("Suggestions for '" + takenName + "': " + checker.suggestAlternatives(takenName));

        // Variable 3: A tricky one. "user1" is taken, and "user11", "user12" are ALSO taken
        // because we loaded up to user1000. Let's see if the code is smart enough to skip them!
        String trickyName = "user1";
        System.out.println("Suggestions for '" + trickyName + "': " + checker.suggestAlternatives(trickyName));
        System.out.println();


        System.out.println("--- PROVING THE TOP SEARCH RESULT IS LEGIT ---");

        // We simulate a bunch of random traffic.
        // The system should naturally figure out that "admin" is the top result.

        for (int i = 0; i < 50; i++) checker.checkAvailability("guest");      // 50 attempts
        for (int i = 0; i < 300; i++) checker.checkAvailability("john_doe");  // 300 attempts
        for (int i = 0; i < 10543; i++) checker.checkAvailability("admin");   // 10,543 attempts
        for (int i = 0; i < 900; i++) checker.checkAvailability("root");      // 900 attempts

        // Fetching the legit top result based on the math above
        System.out.println("getMostAttempted() -> " + checker.getMostAttempted());
    }
}