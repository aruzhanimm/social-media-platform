import java.util.ArrayList;
import java.util.List;

public class SocialMedia {
    // Constructor
    public SocialMedia() {
        this.users = new ArrayList<>();
    }

    private List<User> users;

    // Getter and setter for users
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    // Add user to the platform
    public void addUser(User user) {
        getUsers().add(user);
    }

    // Display all users
    public void displayAllUsers() {
        getUsers().forEach(User::displayInfo);
    }
}

