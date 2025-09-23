class BasicMath {
    public int calculate(int a, int b) {
        return a + b; // Addition
    }

    public double calculate(double a, double b) {
        return a * b; // Multiplication
    }

    public int calculate(int a, int b, int c) {
        return a + b + c; // Sum of three numbers
    }
}

class AdvancedMath extends BasicMath {
    // New overloaded method
    public double calculate(double a, double b, double c) {
        return a / b + c;
    }

    public double calculate(int a, double b) {
        return a - b;
    }
}

public class MathOperationsDemo {
    public static void main(String[] args) {
        AdvancedMath math = new AdvancedMath();

        System.out.println("Addition: " + math.calculate(5, 10));
        System.out.println("Multiplication: " + math.calculate(2.5, 4.0));
        System.out.println("Sum of 3 ints: " + math.calculate(1, 2, 3));
        System.out.println("Advanced: " + math.calculate(10.0, 5.0, 2.0));
        System.out.println("Mixed types: " + math.calculate(10, 2.5));
    }
}
