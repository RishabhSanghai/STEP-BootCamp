import java.util.Random;

class Vehicle {
    // Protected fields (accessible to subclasses)
    protected String brand;
    protected String model;
    protected int year;
    protected String engineType;

    // Private fields
    private String registrationNumber;
    private boolean isRunning;

    // Default constructor
    public Vehicle() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.engineType = "Unknown";
        this.registrationNumber = "REG" + new Random().nextInt(10000);
        this.isRunning = false;
        System.out.println("Vehicle default constructor called");
    }

    // Parameterized constructor
    public Vehicle(String brand, String model, int year, String engineType) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engineType = engineType;
        this.registrationNumber = "REG" + new Random().nextInt(10000);
        this.isRunning = false;
        System.out.println("Vehicle parameterized constructor called");
    }

    // Methods
    public void start() {
        isRunning = true;
        System.out.println("Vehicle started");
    }

    public void stop() {
        isRunning = false;
        System.out.println("Vehicle stopped");
    }

    public String getVehicleInfo() {
        return "Brand: " + brand + ", Model: " + model +
               ", Year: " + year + ", Engine: " + engineType +
               ", RegNo: " + registrationNumber +
               ", Running: " + isRunning;
    }

    public void displaySpecs() {
        System.out.println("Vehicle Specs -> Brand: " + brand +
                           ", Model: " + model +
                           ", Year: " + year +
                           ", Engine: " + engineType);
    }

    // Getters & Setters
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String reg) {
        this.registrationNumber = reg;
    }

    public boolean isRunning() {
        return isRunning;
    }
}

class Car extends Vehicle {
    // Car-specific fields
    private int numberOfDoors;
    private String fuelType;
    private String transmissionType;

    // Default constructor
    public Car() {
        super(); // Explicit call to Vehicle default constructor
        this.numberOfDoors = 4;
        this.fuelType = "Petrol";
        this.transmissionType = "Manual";
        System.out.println("Car default constructor called");
    }

    // Parameterized constructor
    public Car(String brand, String model, int year, String engineType,
               int numberOfDoors, String fuelType, String transmissionType) {
        super(brand, model, year, engineType); // Calls Vehicle constructor
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        System.out.println("Car parameterized constructor called");
    }

    // Override methods
    @Override
    public void start() {
        super.start(); // Call parent start()
        System.out.println("Car-specific startup sequence initiated");
    }

    @Override
    public void displaySpecs() {
        super.displaySpecs(); // Vehicle specs
        System.out.println("Car Specs -> Doors: " + numberOfDoors +
                           ", Fuel: " + fuelType +
                           ", Transmission: " + transmissionType);
    }

    // Car-specific methods
    public void openTrunk() {
        System.out.println("Trunk opened");
    }

    public void playRadio() {
        System.out.println("Radio playing music");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        // Test default constructor
        Car car1 = new Car();
        car1.start();
        car1.displaySpecs();
        car1.openTrunk();
        car1.stop();

        System.out.println("---------------------");

        // Test parameterized constructor
        Car car2 = new Car("Toyota", "Corolla", 2022, "Hybrid",
                           4, "Petrol", "Automatic");
        car2.start();
        System.out.println(car2.getVehicleInfo());
        car2.playRadio();
        car2.displaySpecs();
        car2.stop();
    }
}
