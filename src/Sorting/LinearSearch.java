package Sorting;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 50};
        int key = 30;
        int pos = -1;

        // Traverse the array one by one
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                pos = i; // store index
                break;   // stop once found
            }
        }

        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element " + key + " found at index " + pos);
        }
    }
}

