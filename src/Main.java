public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        user user1 = new user("Aruzhan", "aruzhanimka0@gmail.com");
        user user2 = new user("Vitaly", "vitalukrut@gmail.com");

        Post post1 = new Post("Hello, world!");
        Post post2 = new Post("I love programming");
        Post post3 = new Post("Learning OOP!");

=======
        SocialMedia platform = new SocialMedia();

        User user1 = new User("Aruzhan", "aruzhanimka0@gmail.com");
        User user2 = new User("Vitaly", "vitalukrut@gmail.com");

        Post post1 = new Post("Hello, world!");
        Post post2 = new Post("I love programming.");
        Post post3 = new Post("Learning OOP is fun!");
        // Add posts to users
>>>>>>> 88f5661 (Initial commit)
        user1.addPost(post1);
        user1.addPost(post2);
        user2.addPost(post3);

<<<<<<< HEAD
        System.out.println("User 1 Info:");
        user1.displayInfo();

        System.out.println("\nUser 2 Info:");
        user2.displayInfo();

        // Сравниваем пользователей по имени
        if (user1.getUsername().equals(user2.getUsername())) {
            System.out.println("\nUsers have the same username.");
        } else {
            System.out.println("\nUsers have different usernames.");
        }
    }
}
=======
        user1.setUsername("Aru");
        user1.setEmail("aru_updated@gmail.com");

        post1.like();
        post1.setContent("Hello, Java World!");
        post2.like();
        post2.like();

        platform.addUser(user1);
        platform.addUser(user2);

        platform.displayAllUsers();

        // Compare likes between user1 and user2
        int comparisonResult = user1.compareLikes(user2);

        if (comparisonResult > 0) {
            System.out.println(user1.getUsername() + " has more likes.");
        } else if (comparisonResult < 0) {
            System.out.println(user2.getUsername() + " has more likes.");
        } else {
            System.out.println("Both users have the same number of likes.");
        }
    }
}

>>>>>>> 88f5661 (Initial commit)
