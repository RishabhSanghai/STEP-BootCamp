abstract class Vehicle {
    abstract void dispatch();
}

class Bus extends Vehicle {
    void dispatch() { System.out.println("Bus on fixed route, tracking passenger capacity."); }
}

class Taxi extends Vehicle {
    void dispatch() { System.out.println("Taxi providing door-to-door service, calculating fare by distance."); }
}

class Train extends Vehicle {
    void dispatch() { System.out.println("Train operating on schedule, managing multiple car capacity."); }
}

class Bike extends Vehicle {
    void dispatch() { System.out.println("Bike available for short-distance eco-friendly trips."); }
}

public class TransportationFleetManagement {
    public static void main(String[] args) {
        Vehicle[] fleet = { new Bus(), new Taxi(), new Train(), new Bike() };
        for (Vehicle v : fleet) {
            v.dispatch();  // runtime decides which dispatch method to run
        }
    }
}
