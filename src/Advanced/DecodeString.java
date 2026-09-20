package Advanced;
public class DecodeString {
    public static String decode(String s) {
        StringBuilder out = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i++);
            // assume letters (or you can allow digits inside brackets etc.)
            StringBuilder num = new StringBuilder();
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                num.append(s.charAt(i++));
            }
            int count = num.length() == 0 ? 1 : Integer.parseInt(num.toString());
            for (int k = 0; k < count; k++) out.append(ch);
        }
        return out.toString();
    }

    public static void main(String[] args) {
        System.out.println(decode("A2B3")); // AABBB
        System.out.println(decode("X10Y2")); // XXXXXXXXXXY Y Y  (10 Xs, then 2 Ys)
    }
}
