class Weather {
    protected String description;

    public Weather(String description) {
        this.description = description;
        System.out.println("Weather constructor called");
    }

    public void showWeather() {
        System.out.println("Weather: " + description);
    }
}

// Multilevel: Weather -> Storm -> Thunderstorm
class Storm extends Weather {
    public Storm(String description) {
        super(description);
        System.out.println("Storm constructor called");
    }

    @Override
    public void showWeather() {
        System.out.println("Storm: Heavy winds and rain");
    }
}

class Thunderstorm extends Storm {
    public Thunderstorm(String description) {
        super(description);
        System.out.println("Thunderstorm constructor called");
    }

    @Override
    public void showWeather() {
        System.out.println("Thunderstorm: Lightning with heavy rain");
    }
}

// Hierarchical: Weather -> Sunshine
class Sunshine extends Weather {
    public Sunshine(String description) {
        super(description);
        System.out.println("Sunshine constructor called");
    }

    @Override
    public void showWeather() {
        System.out.println("Sunshine: Bright and clear sky");
    }
}

public class WeatherSystemDemo {
    public static void main(String[] args) {
        Weather[] weathers = {
            new Weather("Generic weather"),
            new Storm("Rainstorm"),
            new Thunderstorm("Lightning storm"),
            new Sunshine("Sunny day")
        };

        System.out.println("\n--- Weather Reports ---");
        for (Weather w : weathers) {
            w.showWeather(); // Polymorphism in action
        }
    }
}
