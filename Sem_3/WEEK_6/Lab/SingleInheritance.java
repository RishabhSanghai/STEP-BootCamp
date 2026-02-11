// Parent class
class Fruit {
    protected String color;
    protected String taste;

    // Constructor
    public Fruit(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    public void showFruitDetails() {
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
    }
}

// Child class
class Apple extends Fruit {
    private String variety;

    public Apple(String color, String taste, String variety) {
        super(color, taste); // Call parent constructor
        this.variety = variety;
    }

    public void showAppleDetails() {
        showFruitDetails();
        System.out.println("Variety: " + variety);
    }
}

// Test class
public class SingleInheritance {
    public static void main(String[] args) {
        Apple apple = new Apple("Red", "Sweet", "Honeycrisp");
        apple.showAppleDetails();
    }
}
