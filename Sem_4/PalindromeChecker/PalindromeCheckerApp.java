public class PalindromeCheckerApp {

    public void showWelcomeScreen() {
        System.out.println("******************************************");
        System.out.println("* *");
        System.out.println("* PALINDROME CHECKER SYSTEM         *");
        System.out.println("* Version 1.0.0                 *");
        System.out.println("* *");
        System.out.println("******************************************");
        System.out.println("\nReady to check some words?");
        System.out.println("------------------------------------------");
    }

    public static void main(String[] args) {
        PalindromeCheckerApp app = new PalindromeCheckerApp();
        app.showWelcomeScreen();
    }
}