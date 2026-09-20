package Array_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramGrouping {
	public static List<List<String>> groupAnagrams(String[] arr) {
		// List to hold the groups of anagrams
		List<List<String>> anagramGroups = new ArrayList<>();
		// Array to keep track of which strings have been grouped
		boolean[] grouped = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (!grouped[i]) { // If this string has not been grouped yet
				// Sort the current string to find its anagram key
				char[] charArray = arr[i].toCharArray();
				Arrays.sort(charArray);
				String key = new String(charArray);

				// Create a new group for this key
				List<String> currentGroup = new ArrayList<>();
				currentGroup.add(arr[i]);
				grouped[i] = true; // Mark this string as grouped

				// Check the rest of the strings for anagrams
				for (int j = i + 1; j < arr.length; j++) {
					if (!grouped[j]) {
						char[] charArrayJ = arr[j].toCharArray();
						Arrays.sort(charArrayJ);
						String keyJ = new String(charArrayJ);

						if (key.equals(keyJ)) {
							currentGroup.add(arr[j]);
							grouped[j] = true; // Mark this string as grouped
						}
					}
				}

				// Add the current group to the list of anagram groups
				anagramGroups.add(currentGroup);
			}
		}

		return anagramGroups;
	}

	public static void main(String[] args) {
		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> output = groupAnagrams(arr);
		System.out.println(output);
	}
}
