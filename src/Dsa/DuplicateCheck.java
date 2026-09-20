package Dsa;
import java.util.HashSet;

public class DuplicateCheck {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5};
        HashSet<Integer> set = new HashSet<>();
        boolean hasDuplicate = false;

        for (int num : arr) {
            if (!set.add(num)) {
                hasDuplicate = true;
                break;
            }
        }

        System.out.println("Contains duplicates? " + hasDuplicate);
    }
}
