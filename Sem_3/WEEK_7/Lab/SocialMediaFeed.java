class Post {
    String author, content, time;
    Post(String author, String content, String time) {
        this.author = author; 
        this.content = content; 
        this.time = time;
    }

    void display() {
        System.out.println(author + ": " + content + " (" + time + ")");
    }
}

class InstagramPost extends Post {
    int likes;
    InstagramPost(String author, String content, String time, int likes) {
        super(author, content, time);
        this.likes = likes;
    }
    @Override
    void display() {
        System.out.println("Instagram Post by " + author + ": " + content + "\nLikes: " + likes);
    }
}

class TwitterPost extends Post {
    int retweets;
    TwitterPost(String author, String content, String time, int retweets) {
        super(author, content, time);
        this.retweets = retweets;
    }
    @Override
    void display() {
        System.out.println("Twitter Post by " + author + ": " + content + " (" + content.length() + " chars)\nRetweets: " + retweets);
    }
}

class LinkedInPost extends Post {
    int connections;
    LinkedInPost(String author, String content, String time, int connections) {
        super(author, content, time);
        this.connections = connections;
    }
    @Override
    void display() {
        System.out.println("LinkedIn Post by " + author + ": " + content + "\nConnections engaged: " + connections);
    }
}

public class SocialMediaFeed {
    public static void main(String[] args) {
        Post p1 = new InstagramPost("Alice", "Enjoying my trip!", "10AM", 120);
        Post p2 = new TwitterPost("Bob", "Just coded polymorphism!", "11AM", 45);
        Post p3 = new LinkedInPost("Dr. Smith", "Publishing research paper", "1PM", 300);

        p1.display();
        p2.display();
        p3.display();
    }
}
