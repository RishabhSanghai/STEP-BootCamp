class Light {
    protected int wattage;
    protected String color;

    // Default constructor
    public Light() {
        this(60, "White"); // Calls another constructor in same class
        System.out.println("Light: Default constructor");
    }

    // Parameterized constructor
    public Light(int wattage, String color) {
        this.wattage = wattage;
        this.color = color;
        System.out.println("Light: Parameterized constructor");
    }
}

class LED extends Light {
    private String type;

    // Default constructor
    public LED() {
        this("Standard"); // Calls another constructor in same class
        System.out.println("LED: Default constructor");
    }

    // Parameterized constructor (chained with super)
    public LED(String type) {
        super(10, "Cool White"); // Call parent constructor
        this.type = type;
        System.out.println("LED: Parameterized constructor");
    }
}

public class LightLedDemo {
    public static void main(String[] args) {
        System.out.println("Creating default LED...");
        LED led1 = new LED();

        System.out.println("\nCreating parameterized LED...");
        LED led2 = new LED("Smart LED");
    }
}
