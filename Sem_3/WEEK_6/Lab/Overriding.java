class Bird {
    public void fly() {
        System.out.println("Some birds can fly");
    }
}

class Penguin extends Bird {
    @Override
    public void fly() {
        System.out.println("Penguins cannot fly");
    }
}

class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("Eagle soars high in the sky");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Bird[] birds = { new Penguin(), new Eagle() };

        for (Bird b : birds) {
            b.fly(); // Polymorphism in action
        }
    }
}
