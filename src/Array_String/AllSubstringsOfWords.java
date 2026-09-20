package Array_String;

public class AllSubstringsOfWords {
    public static void main(String[] args) {
        String[] arr = {"dog"};
        for (String w : arr) {
            for (int i = 0; i < w.length(); i++) {
                for (int j = i + 1; j <= w.length(); j++) {
                    System.out.println(w.substring(i, j));
                }
            }
        }
    }
 }
