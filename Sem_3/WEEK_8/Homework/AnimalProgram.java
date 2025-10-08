interface Animal {
    void eat();
}

interface Pet extends Animal {
    void play();
}

class Dog implements Pet {
    @Override
    public void eat() {
        System.out.println("Dog is eating bones.");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing fetch!");
    }
}

public class AnimalProgram {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.play();
    }
}
