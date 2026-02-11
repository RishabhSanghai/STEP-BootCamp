class Art {
    String title;
    Art(String title) { this.title = title; }
}

class Painting extends Art {
    String technique;
    Painting(String title, String technique) { super(title); this.technique = technique; }
    void showDetails() { System.out.println("Painting: " + title + ", Technique: " + technique); }
}

class Sculpture extends Art {
    String material;
    Sculpture(String title, String material) { super(title); this.material = material; }
    void showDetails() { System.out.println("Sculpture: " + title + ", Material: " + material); }
}

class DigitalArt extends Art {
    String resolution;
    DigitalArt(String title, String resolution) { super(title); this.resolution = resolution; }
    void showDetails() { System.out.println("Digital Art: " + title + ", Resolution: " + resolution); }
}

class Photography extends Art {
    String cameraSettings;
    Photography(String title, String cameraSettings) { super(title); this.cameraSettings = cameraSettings; }
    void showDetails() { System.out.println("Photography: " + title + ", Camera Settings: " + cameraSettings); }
}

public class DigitalArtGallery {
    public static void main(String[] args) {
        Art a = new Painting("Sunset", "Oil on Canvas");

        if (a instanceof Painting) {
            Painting p = (Painting) a;
            p.showDetails();
        }
    }
}
