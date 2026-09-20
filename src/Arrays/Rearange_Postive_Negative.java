package Arrays;

import java.util.Scanner;

public class Rearange_Postive_Negative {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of Arrzy : ");
		int n= sc.nextInt();
		int[] arr=new int [n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int p=0,q=0;
		int[] pos=new int [n];
		int[] neg=new int [n];
		for(int i : arr) {
			if(i>=0) {
				pos[p++]=i;
			}else {
				neg[q++]=i;
			}
		}
		
		int i=0,j=0,k=0;
		while(i<p && j<q) {
			arr[k++]=pos[i++];
			arr[k++]=neg[j++];
		}
		while (i<p) {
			arr[k++]=pos[i++];
		}
		while (j<q) {
			arr[k++]=neg[j++];
		}
		System.out.println("");
		for( int z: arr) {
			
			System.out.print(z + " ");
		}
		


	}
}


//public static void main(String[] args) { 
//    Scanner sc = new Scanner(System.in); 
//    System.out.println("Enter the size : ");
//    int n = sc.nextInt(); 
//    int arr[] = new int[n]; 
//    System.out.println("Enter the elements: ");
//    for(int i = 0; i < n; i++) arr[i] = sc.nextInt(); 
//
//    int[] pos = new int[n]; 
//    int[] neg = new int[n]; 
//    int p = 0, q = 0; 
//
//    for(int num : arr) { 
//        if(num >= 0) pos[p++] = num; 
//        else neg[q++] = num; 
//    } 
//
//    int i = 0, j = 0, k = 0; 
//    while(i < p && j < q) { 
//        arr[k++] = pos[i++]; 
//        arr[k++] = neg[j++]; 
//    } 
//    while(i < p) arr[k++] = pos[i++]; 
//    while(j < q) arr[k++] = neg[j++]; 
//
//    for(int x : arr) System.out.print(x + " "); 
//} 
//} 


