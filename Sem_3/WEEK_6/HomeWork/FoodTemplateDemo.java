abstract class Food {
    // Template method
    public final void prepare() {
        wash();
        cook();
        serve();
        System.out.println("--- Preparation Complete ---\n");
    }

    protected abstract void wash();
    protected abstract void cook();
    protected abstract void serve();
}

class Pizza extends Food {
    @Override
    protected void wash() {
        System.out.println("Washing vegetables for Pizza");
    }

    @Override
    protected void cook() {
        System.out.println("Baking the Pizza in oven");
    }

    @Override
    protected void serve() {
        System.out.println("Serving Pizza with extra cheese");
    }
}

class Soup extends Food {
    @Override
    protected void wash() {
        System.out.println("Washing ingredients for Soup");
    }

    @Override
    protected void cook() {
        System.out.println("Boiling ingredients for Soup");
    }

    @Override
    protected void serve() {
        System.out.println("Serving Soup in a bowl");
    }
}

public class FoodTemplateDemo {
    public static void main(String[] args) {
        Food pizza = new Pizza();
        Food soup = new Soup();

        System.out.println("Preparing Pizza:");
        pizza.prepare();

        System.out.println("Preparing Soup:");
        soup.prepare();
    }
}
