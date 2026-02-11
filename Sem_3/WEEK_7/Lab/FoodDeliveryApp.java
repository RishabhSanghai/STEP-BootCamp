class Delivery {
    // Basic delivery
    void calculateDelivery(double distance) {
        double cost = distance * 5;
        System.out.println("Basic Delivery: Distance = " + distance + " km, Cost = ₹" + cost);
    }

    // Premium delivery (distance + priority fee)
    void calculateDelivery(double distance, double priorityFee) {
        double cost = (distance * 5) + priorityFee;
        System.out.println("Premium Delivery: Distance = " + distance + " km + Priority Fee = ₹" + priorityFee + ", Total = ₹" + cost);
    }

    // Group delivery (distance + number of orders discount)
    void calculateDelivery(double distance, int orders) {
        double cost = (distance * 5) - (orders * 10);
        System.out.println("Group Delivery: Distance = " + distance + " km, Orders = " + orders + ", Total = ₹" + cost);
    }

    // Festival special (distance + discount + free delivery condition)
    void calculateDelivery(double distance, double discountPercent, double freeLimit) {
        double cost = distance * 5;
        if (cost > freeLimit) {
            System.out.println("Festival Delivery: FREE (Order above ₹" + freeLimit + ")");
        } else {
            double discounted = cost - (cost * discountPercent / 100);
            System.out.println("Festival Delivery: Distance = " + distance + " km, Discount = " + discountPercent + "%, Total = ₹" + discounted);
        }
    }
}

public class FoodDeliveryApp {
    public static void main(String[] args) {
        Delivery d = new Delivery();
        d.calculateDelivery(10);                  // basic
        d.calculateDelivery(10, 50);              // premium
        d.calculateDelivery(10, 3);               // group
        d.calculateDelivery(10, 20, 100);         // festival
    }
}
