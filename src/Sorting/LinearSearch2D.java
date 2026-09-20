package Sorting;

public class LinearSearch2D {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int key = 50;
        boolean found = false;

        // Traverse row by row
        for (int i = 0; i < arr.length; i++) {           // rows
            for (int j = 0; j < arr[i].length; j++) {    // columns
                if (arr[i][j] == key) {
                    System.out.println("Element " + key + " found at position: (" + i + ", " + j + ")");
                    found = true;
                    break;  // break inner loop
                }
            }
            if (found) break; // break outer loop too
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }
}

