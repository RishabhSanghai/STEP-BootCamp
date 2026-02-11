import java.util.*;

// ==================== CLASS: BankAccount ====================
class BankAccount {
    private String accountNumber;
    private double balance;
    private int pin;

    public BankAccount(String accountNumber, double balance, int pin) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public boolean validatePin(int enteredPin) {
        return this.pin == enteredPin;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " | New Balance: ₹" + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("❌ Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " | Remaining Balance: ₹" + balance);
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

// ==================== CLASS: Customer ====================
class Customer {
    private String name;
    private List<BankAccount> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount acc) {
        accounts.add(acc);
        System.out.println(name + " added Account " + acc.getAccountNumber());
    }

    public BankAccount getAccount(String accNum) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(accNum))
                return acc;
        }
        return null;
    }

    public String getName() {
        return name;
    }
}

// ==================== CLASS: ATM ====================
class ATM {
    public void startTransaction(Customer customer, String accNum, int enteredPin) {
        BankAccount account = customer.getAccount(accNum);
        if (account == null) {
            System.out.println("Account not found!");
            return;
        }

        if (!account.validatePin(enteredPin)) {
            System.out.println("❌ Invalid PIN!");
            return;
        }

        System.out.println("\nWelcome, " + customer.getName() + "! Access granted to Account " + accNum);
        account.checkBalance();

        // Example transactions
        account.deposit(2000);
        account.withdraw(1500);
        account.checkBalance();
    }
}

// ==================== MAIN CLASS ====================
public class ATMSystem {
    public static void main(String[] args) {
        Customer c1 = new Customer("Riya");

        BankAccount acc1 = new BankAccount("ACC123", 5000, 1234);
        BankAccount acc2 = new BankAccount("ACC456", 10000, 5678);

        c1.addAccount(acc1);
        c1.addAccount(acc2);

        ATM atm = new ATM();
        atm.startTransaction(c1, "ACC123", 1234);  // correct PIN
        atm.startTransaction(c1, "ACC456", 1111);  // wrong PIN
    }
}
