package Advanced;
import java.util.regex.Pattern;

public class PasswordValidator {
    private static final Pattern POLICY = Pattern.compile(
        "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[^A-Za-z0-9]).{8,}$"
    );

    public static boolean validate(String pwd) {
        return POLICY.matcher(pwd).matches();
    }

    public static void main(String[] args) {
        System.out.println(validate("Abc@1234")); // true
        System.out.println(validate("weakpass")); // false
    }
}
