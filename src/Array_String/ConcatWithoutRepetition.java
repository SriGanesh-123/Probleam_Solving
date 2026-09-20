package Array_String;
 public class ConcatWithoutRepetition {
    public static void main(String[] args) {
        String[] arr = {"abc","bcd","cde"};
        String result = "";
        for (String word : arr) {
            for (char c : word.toCharArray()) {
                if (result.indexOf(c) == -1) result += c;
            }
        }
        System.out.println(result);
    }
 }