import java.time.LocalDateTime;

public class Post {
    private String content;
    private LocalDateTime dateCreated;

    public Post(String content) {
        this.content = content;
        this.dateCreated = LocalDateTime.now();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void displayInfo() {
        System.out.println("Content: " + content);
        System.out.println("Created at: " + dateCreated);
    }
}

