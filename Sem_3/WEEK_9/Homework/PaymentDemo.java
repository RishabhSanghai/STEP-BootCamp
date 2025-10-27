interface Discount {
    double apply(double amount);
}

class Payment {
    void processTransaction(double amount) {
        class Validator {
            boolean validate(double amt) {
                return amt > 0;
            }
        }

        Validator v = new Validator();
        if (!v.validate(amount)) {
            System.out.println("Invalid amount!");
            return;
        }

        Discount discount = new Discount() {
            public double apply(double amt) {
                return amt * 0.9; // 10% discount
            }
        };

        double finalAmount = discount.apply(amount);
        System.out.println("Original Amount: " + amount + ", After Discount: " + finalAmount);
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p = new Payment();
        p.processTransaction(1000);
    }
}
