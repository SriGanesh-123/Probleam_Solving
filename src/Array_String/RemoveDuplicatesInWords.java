package Array_String;
 public class RemoveDuplicatesInWords {
    public static void main(String[] args) {
        String[] arr = {"banana","apple"};
        for (String word : arr) {
            String result = "";
            for (char c : word.toCharArray()) {
                if (result.indexOf(c) == -1) result += c;
            }
            System.out.println(result);
        }
    }
 }