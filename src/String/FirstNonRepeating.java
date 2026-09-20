package String;
import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (freq.get(c) == 1) {
                System.out.println("First Non-Repeating Character: " + c);
                break;
            }
        }
    }
}
