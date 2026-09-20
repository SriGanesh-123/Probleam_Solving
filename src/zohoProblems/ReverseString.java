package zohoProblems;
public class ReverseString {
    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Reversed: " + reverse(str));
    }
}
