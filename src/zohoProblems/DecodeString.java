package zohoProblems;
public class DecodeString {
    public static String decode(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i+=2) {
            char c = s.charAt(i);
            int count = s.charAt(i+1) - '0';
            sb.append(String.valueOf(c).repeat(count));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(decode("A2B3")); // AABBB
    }
}
