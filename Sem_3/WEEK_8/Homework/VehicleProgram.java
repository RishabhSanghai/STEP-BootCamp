abstract class Vehicle {
    public abstract void start();

    public void stop() {
        System.out.println("Vehicle stopped.");
    }
}

interface Fuel {
    void refuel();
}

class Car extends Vehicle implements Fuel {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println(model + " engine started.");
    }

    @Override
    public void refuel() {
        System.out.println(model + " is being refueled with petrol.");
    }
}

public class VehicleProgram {
    public static void main(String[] args) {
        Car car = new Car("Honda City");
        car.start();
        car.refuel();
        car.stop();
    }
}
