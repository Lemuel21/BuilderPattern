package Builder;

public class User {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String address;
    private final String phone;
    private final int age;

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;
    }

    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private String address;
        private String phone;
        private int age;

        public UserBuilder(String firstName, String lastName, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        public UserBuilder Address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder Phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder Age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }


    }

    public String toString() {
        return "User - firstName='" + firstName + "', lastName='" + lastName + "', email='" + email + "', address='" + address + "', phone='" + phone + "', age=" + age + '}';
    }
}

