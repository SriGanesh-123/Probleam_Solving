package Arrays;

import java.util.Scanner; 

public class ReplaceWithNextGreater { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the size : ");
        int n = sc.nextInt(); 
		int[] arr = new int[n];
		System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt(); 
 
        for (int i = 0; i < n - 1; i++) { 
            int nextGreater = -1; 
            for (int j = i + 1; j < n; j++) { 
                if (arr[j] > arr[i]) { 
                    nextGreater = arr[j]; 
break; 
} 
} 
arr[i] = nextGreater; 
} 
arr[n - 1] = -1; 
for (int val : arr) System.out.print(val + " ");
    }
}
