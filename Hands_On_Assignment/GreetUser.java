public class GreetUser {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
            return;
        }

        // Combine all args into a full string
        StringBuilder fullMessage = new StringBuilder();
        for (String arg : args) {
            fullMessage.append(arg).append(" ");
        }

        System.out.println("Greeting Message: " + fullMessage.toString().trim());
    }
}
