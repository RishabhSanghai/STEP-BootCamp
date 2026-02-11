class HotelBooking {
    // Standard booking
    void calculatePrice(String roomType, int nights) {
        double cost = nights * 1000;
        System.out.println("Standard Booking: Room = " + roomType + ", Nights = " + nights + ", Total Cost = ₹" + cost);
    }

    // Seasonal booking
    void calculatePrice(String roomType, int nights, double seasonalMultiplier) {
        double cost = nights * 1000 * seasonalMultiplier;
        System.out.println("Seasonal Booking: Room = " + roomType + ", Nights = " + nights + ", Seasonal Multiplier = " + seasonalMultiplier + ", Total Cost = ₹" + cost);
    }

    // Corporate booking
    void calculatePrice(String roomType, int nights, double corporateDiscount, boolean mealPackage) {
        double baseCost = nights * 1000;
        double discount = baseCost * corporateDiscount / 100;
        double mealCost = mealPackage ? 500 : 0;
        double total = baseCost - discount + mealCost;
        System.out.println("Corporate Booking: Room = " + roomType + ", Nights = " + nights + ", Discount = " + corporateDiscount + "%, Meal Package = " + mealPackage + ", Total Cost = ₹" + total);
    }

    // Wedding package
    void calculatePrice(String roomType, int nights, int guestCount, double decorationFee, boolean catering) {
        double baseCost = nights * 1000;
        double cateringCost = catering ? guestCount * 500 : 0;
        double total = baseCost + decorationFee + cateringCost;
        System.out.println("Wedding Package: Room = " + roomType + ", Nights = " + nights + ", Guests = " + guestCount + ", Decoration Fee = ₹" + decorationFee + ", Catering = " + catering + ", Total Cost = ₹" + total);
    }
}

public class HotelBookingSystem {
    public static void main(String[] args) {
        HotelBooking hb = new HotelBooking();
        hb.calculatePrice("Deluxe", 3);                         // standard
        hb.calculatePrice("Deluxe", 3, 1.2);                   // seasonal
        hb.calculatePrice("Deluxe", 3, 10, true);              // corporate
        hb.calculatePrice("Deluxe", 3, 50, 2000, true);        // wedding
    }
}
