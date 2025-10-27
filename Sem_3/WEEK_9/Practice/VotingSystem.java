// File: VotingSystem.java
public class VotingSystem {
    public void processVote(String voterId, String candidate) {
        class VoteValidator {
            boolean validate(String id) {
                return id != null && id.startsWith("VOTER");
            }
        }

        VoteValidator validator = new VoteValidator();
        if (validator.validate(voterId))
            System.out.println("Vote accepted for " + candidate);
        else
            System.out.println("Invalid voter ID: " + voterId);
    }

    public static void main(String[] args) {
        VotingSystem vs = new VotingSystem();
        vs.processVote("VOTER123", "Alice");
        vs.processVote("12345", "Bob");
    }
}
