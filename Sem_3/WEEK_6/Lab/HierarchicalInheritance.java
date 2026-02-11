class Instrument {
    protected String name;
    protected String material;

    public Instrument(String name, String material) {
        this.name = name;
        this.material = material;
    }

    public void showInstrument() {
        System.out.println("Name: " + name + ", Material: " + material);
    }
}

class Piano extends Instrument {
    private int keys;

    public Piano(String name, String material, int keys) {
        super(name, material);
        this.keys = keys;
    }

    public void showDetails() {
        showInstrument();
        System.out.println("Keys: " + keys);
    }
}

class Guitar extends Instrument {
    private int strings;

    public Guitar(String name, String material, int strings) {
        super(name, material);
        this.strings = strings;
    }

    public void showDetails() {
        showInstrument();
        System.out.println("Strings: " + strings);
    }
}

class Drum extends Instrument {
    private String type;

    public Drum(String name, String material, String type) {
        super(name, material);
        this.type = type;
    }

    public void showDetails() {
        showInstrument();
        System.out.println("Type: " + type);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Instrument[] instruments = {
            new Piano("Grand Piano", "Wood", 88),
            new Guitar("Acoustic Guitar", "Wood", 6),
            new Drum("Bass Drum", "Metal", "Percussion")
        };

        for (Instrument inst : instruments) {
            if (inst instanceof Piano) ((Piano)inst).showDetails();
            else if (inst instanceof Guitar) ((Guitar)inst).showDetails();
            else if (inst instanceof Drum) ((Drum)inst).showDetails();
            System.out.println();
        }
    }
}
