public class UserRegistration {
    public static void registerUser(String userCountry) throws InvalidCountryException {
        if (!userCountry.equals("India")) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        }
        System.out.println("User registration done successfully");
    }

    public static void main(String[] args) {
        try {
            registerUser("US");
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }

        try {
            registerUser("India");
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}