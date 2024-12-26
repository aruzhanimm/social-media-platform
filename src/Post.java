import java.time.LocalDateTime;

public class Post {
<<<<<<< HEAD
    private String content;
    private LocalDateTime dateCreated;

    public Post(String content) {
        this.content = content;
        this.dateCreated = LocalDateTime.now();
    }
=======
    //constructor
    public Post(String content) {
        setContent(content);
        setDateCreated(LocalDateTime.now());
        setLikes(0);
    }
    // Getter and setter for content
    private String content;
    private LocalDateTime dateCreated;
    private int likes;
>>>>>>> 88f5661 (Initial commit)

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
<<<<<<< HEAD
        this.content = content;
    }

=======
        if (content == null || content.isBlank()) {
            throw new IllegalArgumentException("Content cannot be empty.");
        }
        this.content = content;
    }
    // Getter and setter for dateCreated
>>>>>>> 88f5661 (Initial commit)
    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

<<<<<<< HEAD
    public void displayInfo() {
        System.out.println("Content: " + content);
        System.out.println("Created at: " + dateCreated);
=======
    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
    // Getter and setter for likes
    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
    // Method to add a like
    public void like() {
        setLikes(getLikes() + 1);  // Use setter to increase likes
    }
    // Display post info
    public void displayInfo() {
        System.out.println("Content: " + getContent());
        System.out.println("Created at: " + getDateCreated());
        System.out.println("Likes: " + getLikes());
>>>>>>> 88f5661 (Initial commit)
    }
}

