
import java.util.ArrayList;
import java.util.List;

public class user {
    private String username;
    private String email;
    private List<Post> posts;

    public user(String username, String email) {
        this.username = username;
        this.email = email;
        this.posts = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(Post post) {
        this.posts.add(post);
    }

    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Posts:");
        for (Post post : posts) {
            post.displayInfo();
        }
    }
}
