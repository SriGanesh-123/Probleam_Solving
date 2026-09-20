package Array_String;
 public class MaxUniqueChars {
    public static void main(String[] args) {
        String[] arr = {"hello","world","zoho"};
        String result = "";
        int maxUnique = 0;
        for (String word : arr) {
            boolean[] seen = new boolean[256];
            int count = 0;
            for (char c : word.toCharArray()) {
                if (!seen[c]) {
                    seen[c] = true;
                    count++;
                }
            }
            if (count > maxUnique) {
                maxUnique = count;
                result = word;
            }
        }
        System.out.println(result);
    }
 }