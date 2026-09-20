package Array_String;

public class MaxCharFrequencyWord {
    public static void main(String[] args) {
        String[] arr = {"apple","banana","grape"};
        String result = "";
        int maxFreq = 0;
        for (String word : arr) {
            int[] freq = new int[256];
            int localMax = 0;
            for (char c : word.toCharArray()) {
                freq[c]++;
                localMax = Math.max(localMax, freq[c]);
            }
            if (localMax > maxFreq) {
                maxFreq = localMax;
                result = word;
            }
        }
        System.out.println(result);
    }
 }