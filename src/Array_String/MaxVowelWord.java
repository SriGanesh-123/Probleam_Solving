package Array_String;
 public class MaxVowelWord {
    public static void main(String[] args) {
        String[] arr = {"strength","education","quiz"};
        String result = "";
        int maxVowels = 0;
        for (String word : arr) {
            int count = 0;
            for (char c : word.toCharArray()) {
                if ("aeiou".indexOf(c) != -1) count++;
            }
            if (count > maxVowels) {
                maxVowels = count;
                result = word;
            }
        }
        System.out.println(result);
    }
 }