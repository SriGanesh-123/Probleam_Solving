package zohoProblems;
public class PasswordValidation {
    public static boolean isValid(String password) {
        return password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$");
    }

    public static void main(String[] args) {
        System.out.println(isValid("Abc@1234")); // true
        System.out.println(isValid("abc123"));   // false
    }
}
