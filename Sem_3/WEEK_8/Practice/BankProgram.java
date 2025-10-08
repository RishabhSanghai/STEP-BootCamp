abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 0.04;
        System.out.println("Savings Account Interest: " + interest);
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 0.02;
        System.out.println("Current Account Interest: " + interest);
    }
}

public class BankProgram {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(10000);
        savings.displayBalance();
        savings.calculateInterest();

        System.out.println("------------------");

        BankAccount current = new CurrentAccount(10000);
        current.displayBalance();
        current.calculateInterest();
    }
}
