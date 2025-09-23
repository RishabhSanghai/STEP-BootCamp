import java.util.Objects;

class Game {
    protected String name;

    public Game(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Game{name='" + name + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same object
        if (!(obj instanceof Game)) return false;
        Game other = (Game) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class CardGame extends Game {
    private int deckSize;

    public CardGame(String name, int deckSize) {
        super(name);
        this.deckSize = deckSize;
    }

    @Override
    public String toString() {
        return super.toString() + ", CardGame{deckSize=" + deckSize + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof CardGame)) return false;
        CardGame other = (CardGame) obj;
        return this.deckSize == other.deckSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), deckSize);
    }
}

public class GameDemo {
    public static void main(String[] args) {
        Game g1 = new Game("Generic Game");
        CardGame c1 = new CardGame("Poker", 52);
        CardGame c2 = new CardGame("Poker", 52);

        System.out.println(g1);
        System.out.println(c1);

        System.out.println("c1 equals c2? " + c1.equals(c2));
        System.out.println("g1 equals c1? " + g1.equals(c1));
    }
}
