public class PersonDetails {
    static class AgeValidationException extends Exception {
        public AgeValidationException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java PersonDetails <name> <age>");
            System.exit(1);
        }

        try {
            String name = args[0];
            int age = Integer.parseInt(args[1]);
            if (age < 18 || age > 60) {
                throw new AgeValidationException("Age must be between 18 and 60");
            }
            System.out.println("Name: " + name + ", Age: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Age must be a valid integer");
            System.exit(1);
        } catch (AgeValidationException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            System.exit(1);
        }
    }
}