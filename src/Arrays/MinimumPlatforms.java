package Arrays;

public class MinimumPlatforms { 
	 
    // Manual sort method (simple Bubble Sort) 
    public static void bubbleSort(int[] arr) { 
        int n = arr.length; 
        for (int x = 0; x < n - 1; x++) { 
            for (int y = 0; y < n - x - 1; y++) { 
                if (arr[y] > arr[y + 1]) { 
                    int temp = arr[y]; 
                    arr[y] = arr[y + 1]; 
                    arr[y + 1] = temp; 
                } 
            } 
        } 
    } 
 
    public static int findMinPlatforms(int[] arrivals, int[] 
departures) { 
        int n = arrivals.length; 
 
        // Sort both arrays manually 
        bubbleSort(arrivals); 
        bubbleSort(departures); 
 
        int platformNeeded = 1;  
        int maxPlatforms = 1; 
        int i = 1; // pointer for arrivals 
        int j = 0; // pointer for departures 
 
        while (i < n && j < n) { 
            if (arrivals[i] <= departures[j]) { 
                platformNeeded++; 
                i++; 
                if (platformNeeded > maxPlatforms) 
                    maxPlatforms = platformNeeded; 
            } else { 
                platformNeeded--; 
                j++; 
            } 
        } 
        return maxPlatforms; 
    } 
 
    public static void main(String[] args) { 
        int arrivals[] = {900, 940, 950, 1100, 1500, 1800}; 
        int departures[] = {910, 1200, 1120, 1130, 1900, 2000}; 
 
        System.out.println(findMinPlatforms(arrivals, 
departures)); // Output: 3 
    } 
}
