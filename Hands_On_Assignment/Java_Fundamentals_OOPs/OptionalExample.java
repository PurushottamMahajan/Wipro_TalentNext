import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String[] names = new String[5];
        Optional<String> opt = Optional.ofNullable(names[0]);
        System.out.println(opt.isPresent() ? opt.get().length() : 0);
    }
}