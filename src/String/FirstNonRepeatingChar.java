package String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Use LinkedHashMap to maintain insertion order
        Map<Character, Integer> freqMap = new LinkedHashMap<>();
        																						
        // Count frequency of each character
        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Find first character with frequency 1
        char result = '\0'; // null char as default
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                result = entry.getKey();
                break;
            }
        }

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
/*import java.util.Scanner;

public class FirstNonRepeat_Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] freq = new int[256]; // ASCII
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        char result = '\0';
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                result = s.charAt(i);
                break;
            }
        }

        System.out.println(result == '\0' ? "No non-repeating character found." 
                                          : "First non-repeating character: " + result);
    }
}
*/
