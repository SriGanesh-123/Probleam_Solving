package String;
public class PalindromeCheck {

    public static boolean isPalindrome(String s) {
        if (s == null) return false;

        int left = 0, right = s.length() - 1;

        while (left < right) {
            // Move left pointer to next alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            // Move right pointer to previous alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;

            // Compare characters ignoring case
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(input)); // true

        String input2 = "Hello, World!";
        System.out.println(isPalindrome(input2)); // false
    }
}
