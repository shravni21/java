public class User {


    private String username;
    private String emailAddress;
    private String first_name;
    private String last_name;
    private int phoneNumber;
    private String Address;

    private User(Builder b) {
        this.username = b.username;
        this.first_name = b.first_name;
        this.last_name = b.last_name;
        this.phoneNumber = b.phoneNumber;
        this.emailAddress = b.emailAddress;
        this.Address = b.Address;
    }

    public static class Builder {
        private String username;
        private String emailAddress;
        private String first_name;
        private String last_name;
        private int phoneNumber;
        private String Address;

        public Builder(String username, String emailAddress) {
            this.username = username;
            this.emailAddress = emailAddress;
        }

        public Builder firstName(String val) {
            this.first_name = val;
            return this;
        }

        public Builder lastName(String val) {
            this.last_name = val;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public String toString() {
        return "User [UserName=" + username + ", emailAddress=" + emailAddress + ", FirstName= " + first_name + ", lastName= " + last_name + ", phoneNumber= " + phoneNumber + ", Address= " + Address + "]";
    }
}
