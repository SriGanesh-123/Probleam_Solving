package Array_String;
 public class StringCompression {
    public static void main(String[] args) {
        String[] arr = {"aabb","aaabbc"};
        for (String word : arr) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for (int i = 1; i <= word.length(); i++) {
                if (i < word.length() && word.charAt(i) == word.charAt(i-1)) {
                    count++;
                } else {
                    sb.append(word.charAt(i-1)).append(count);
                    count = 1;
                }
            }
            System.out.println(sb);
        }
    }
 }