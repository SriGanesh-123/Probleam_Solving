package Arrays;

import java.util.Scanner;

public class Next_Greater_Element_for_Each {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("hi");

		for (int i = 0; i < n-1 ; i++) {
			
				if (arr[i] < arr[i + 1]) {
					System.out.print(arr[i] + "- > " + arr[i+ 1] + ", \t");
					// i++;
				}  if (arr[i]==arr[n-1]){
					System.out.print(arr[i] + " - >  -1");
				}

			}
		if (arr[n-1]==arr[n-1]){
			System.out.print(" "+arr[n-1] + " - >  -1");
		}
		}
	
}



//package Zoho;
//
//import java.util.Scanner;
//
//public class Next_Greater_Element_for_Each {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the size of Array : ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        System.out.println("Enter the Elements : ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        // For each element, find the smallest greater number
//        for (int i = 0; i < n; i++) {
//            int smallestGreater = Integer.MAX_VALUE;
//            boolean found = false;
//
//            for (int j = 0; j < n; j++) {
//                if (arr[j] > arr[i] && arr[j] < smallestGreater) {
//                    smallestGreater = arr[j];
//                    found = true;
//                }
//            }
//
//            if (found) {
//                System.out.println(arr[i] + " -> " + smallestGreater);
//            } else {
//                System.out.println(arr[i] + " -> -1");
//            }
//        }
//    }
//}
