import java.util.ArrayList;

public class NameJoiner {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        String result = "{" + String.join(", ", names) + "}";
        System.out.println(result); // {Alice, Bob, Charlie}
    }
}