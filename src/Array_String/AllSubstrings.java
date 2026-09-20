package Array_String;
 public class AllSubstrings {
    public static void main(String[] args) {
        String word = "dog";
        for (int i = 0; i < word.length(); i++) {
            for (int j = i+1; j <= word.length(); j++) {
                System.out.println(word.substring(i, j));
            }
        }
    }
 }