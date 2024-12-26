import java.util.ArrayList;
import java.util.List;

public class User {
    // Constructor
    public User(String username, String email) {
        setUsername(username);
        setEmail(email);
        this.posts = new ArrayList<>();
    }

    private String username;
    private String email;
    private List<Post> posts;
    // Getter and setter for username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username cannot be empty.");
        }
        this.username = username;
    }
    // Getter and setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be empty.");
        }
        this.email = email;
    }
    // Getter and setter for posts
    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public void addPost(Post post) {
        getPosts().add(post);
    }

    // Compare likes of all posts of two users
    public int compareLikes(User otherUser) {
        int totalLikesUser1 = this.getPosts().stream().mapToInt(Post::getLikes).sum();
        int totalLikesUser2 = otherUser.getPosts().stream().mapToInt(Post::getLikes).sum();

        return Integer.compare(totalLikesUser1, totalLikesUser2);  // Return -1, 0, or 1 for comparison
    }

    public void displayInfo() {
        System.out.println("Username: " + getUsername());
        System.out.println("Email: " + getEmail());
        getPosts().forEach(Post::displayInfo);
    }
}
