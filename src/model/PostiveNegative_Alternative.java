package model;

import java.util.Scanner;

public class PostiveNegative_Alternative {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size :");
	int n=sc.nextInt();
	int[] a = new int[n];
	int size=a.length;
	 System.out.println("Enter 5 numbers (can be negative):");
     for (int i = 0; i < a.length; i++) {
         a[i] = sc.nextInt();
     }
	
	int[] pos =new int[n];
	int[] neg =new int[n];
	int posind=0;
	int negind=0;
	
	for (int i=0;i<size;i++) {
		if(a[i]>0) {
			pos[posind]=a[i];
			posind++;
		}
		
	}
	for (int i=0;i<size;i++) {
		if(a[i]<0) {
			neg[negind]=a[i];
			negind++;
		}
		
	}
	System.out.println("Input");
	for(int b :a) {
		System.out.println(b);
	}
	
	
	System.out.println("After ");
	int i=0,j=0;
	while(i<posind && j<negind) {
		System.out.print(pos[i++] + " ");
		System.out.print(neg[j++] + " ");
	}
	while (i>posind) {
		System.out.print(pos[i++] + " ");
	}
	while (i>negind) {
		System.out.print(neg[j++] + " ");
	}
//	for(int b :a) {
//		System.out.println(b);
//	}
//	
//	for(int b :pos) {
//		System.out.println(b);
//	}
//	
//	System.out.println("Negtative");
//	for(int b :neg) {
//		System.out.println(b);
//	}
}
}
//
//
//package model;
//
//import java.util.Scanner;
//
//public class PostiveNegative_Alternative {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter size :");
//        int n = sc.nextInt();
//
//        int[] a = new int[n];
//        System.out.println("Enter " + n + " numbers (can be negative):");
//        for (int i = 0; i < a.length; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        int[] pos = new int[n]; // store positives
//        int[] neg = new int[n]; // store negatives
//        int posind = 0;
//        int negind = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] > 0) {
//                pos[posind] = a[i]; // copy from a[i]
//                posind++;
//            } else if (a[i] < 0) {
//                neg[negind] = a[i]; // copy from a[i]
//                negind++;
//            }
//        }
//
//        System.out.println("\nAll Numbers:");
//        for (int b : a) {
//            System.out.print(b + " ");
//        }
//
//        System.out.println("\n\nPositive Numbers:");
//        for (int i = 0; i < posind; i++) {
//            System.out.print(pos[i] + " ");
//        }
//
//        System.out.println("\n\nNegative Numbers:");
//        for (int i = 0; i < negind; i++) {
//            System.out.print(neg[i] + " ");
//        }
//    }
//}
//
