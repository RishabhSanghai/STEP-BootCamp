interface PaymentGateway {
    void pay(double amount);
    void refund(double amount);
}

class CreditCardPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Credit Card");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to Credit Card");
    }
}

class UPIPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via UPI");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to UPI");
    }
}

public class PaymentProgram {
    public static void main(String[] args) {
        PaymentGateway credit = new CreditCardPayment();
        credit.pay(2500);
        credit.refund(500);

        System.out.println("------------------");

        PaymentGateway upi = new UPIPayment();
        upi.pay(1000);
        upi.refund(200);
    }
}
