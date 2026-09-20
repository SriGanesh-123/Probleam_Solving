package Sorting;

public class BinarySearch {


    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30, 35};  // sorted array
        int key = 25;

        int result = binarySearch(arr, key);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element " + key + " found at index " + result);
        }
    }

    // Binary Search Method
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;  // avoid overflow

            if (arr[mid] == key) {
                return mid;   // element found
            } else if (arr[mid] < key) {
                left = mid + 1;  // search in right half
            } else {
                right = mid - 1; // search in left half
            }
        }

        return -1;  // not found
    }
}

