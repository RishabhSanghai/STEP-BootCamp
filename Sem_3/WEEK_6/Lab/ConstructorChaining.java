class Phone {
    protected String brand;
    protected String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println("Phone constructor called");
    }
}

class SmartPhone extends Phone {
    private String operatingSystem;

    public SmartPhone(String brand, String model, String operatingSystem) {
        super(brand, model); // Call Phone constructor
        this.operatingSystem = operatingSystem;
        System.out.println("SmartPhone constructor called");
    }

    public void showDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", OS: " + operatingSystem);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone("Apple", "iPhone 15", "iOS 17");
        sp.showDetails();
    }
}
