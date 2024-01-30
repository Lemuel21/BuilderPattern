package Builder;

public class UserApp {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Chyai", "Taps", "chai03@gmail.com")
                .Address("Cavite City")
                .Phone("09673319818")
                .Age(21)
                .build();

        System.out.println(user1);

    }
}
