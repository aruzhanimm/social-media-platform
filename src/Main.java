public class Main {
    public static void main(String[] args) {
        user user1 = new user("Aruzhan", "aruzhanimka0@gmail.com");
        user user2 = new user("Vitaly", "vitalukrut@gmail.com");

        Post post1 = new Post("Hello, world!");
        Post post2 = new Post("I love programming");
        Post post3 = new Post("Learning OOP!");

        user1.addPost(post1);
        user1.addPost(post2);
        user2.addPost(post3);

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
