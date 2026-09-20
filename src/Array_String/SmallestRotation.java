package Array_String;
 public class SmallestRotation {
    public static void main(String[] args) {
        String s = "bca";
        String smallest = s;
        for (int i = 1; i < s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if (rotated.compareTo(smallest) < 0) smallest = rotated;
        }
        System.out.println(smallest);
    }
 }