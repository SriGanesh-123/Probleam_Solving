package Arrays;

import java.util.Scanner; 

public class EquilibriumIndex { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the Size : ");
        int n = sc.nextInt(); 
        int[] arr = new int[n]; 
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) 
        	arr[i] = sc.nextInt(); 
 
        for (int i = 0; i < n; i++) { 
            int leftSum = 0, rightSum = 0; 
 
            for (int j = 0; j < i; j++) 
            	leftSum += arr[j]; 
            for (int j = i + 1; j < n; j++) 
            	rightSum += arr[j]; 
 
if (leftSum == rightSum) { 
System.out.println(i); 
return; 
} 
} 
System.out.println(-1); // If no equilibrium index found 
} 
}