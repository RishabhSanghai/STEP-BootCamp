abstract class Character {
    abstract void attack();
}

class Warrior extends Character {
    void attack() { System.out.println("Warrior slashes with sword! High defense!"); }
}

class Mage extends Character {
    void attack() { System.out.println("Mage casts fireball using mana!"); }
}

class Archer extends Character {
    void attack() { System.out.println("Archer shoots an arrow with precision!"); }
}

public class GamingCharacterSystem {
    public static void main(String[] args) {
        Character[] army = { new Warrior(), new Mage(), new Archer() };
        for (Character c : army) {
            c.attack();  // runtime decides actual attack
        }
    }
}
