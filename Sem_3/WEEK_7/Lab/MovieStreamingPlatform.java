class Content {
    String title;
    Content(String title) { this.title = title; }
}

class Movie extends Content {
    int duration; 
    String subtitles;
    Movie(String title, int duration, String subtitles) {
        super(title); 
        this.duration = duration; 
        this.subtitles = subtitles;
    }
    void showMovieInfo() {
        System.out.println("Movie: " + title + " (" + duration + " mins, Subtitles: " + subtitles + ")");
    }
}

class TVSeries extends Content {
    int seasons;
    TVSeries(String title, int seasons) {
        super(title); 
        this.seasons = seasons;
    }
    void showSeriesInfo() {
        System.out.println("Series: " + title + " with " + seasons + " seasons");
    }
}

class Documentary extends Content {
    String tag;
    Documentary(String title, String tag) {
        super(title); 
        this.tag = tag;
    }
    void showDocInfo() {
        System.out.println("Documentary: " + title + " [Tag: " + tag + "]");
    }
}

public class MovieStreamingPlatform {
    public static void main(String[] args) {
        Content c = new Movie("Inception", 148, "English"); // stored as parent

        // Downcasting back to access movie features
        if (c instanceof Movie) {
            Movie m = (Movie) c;
            m.showMovieInfo();
        }
    }
}
