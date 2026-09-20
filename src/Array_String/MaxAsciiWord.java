package Array_String;
 public class MaxAsciiWord {
    public static void main(String[] args) {
        String[] arr = {"abc","zzz","pq"};
        String result = "";
        int maxSum = 0;
        for (String word : arr) {
            int sum = 0;
            for (char c : word.toCharArray()) {
                sum += c;
            }
            if (sum > maxSum) {
                maxSum = sum;
                result = word;
            }
        }
        System.out.println(result);
    }
 }