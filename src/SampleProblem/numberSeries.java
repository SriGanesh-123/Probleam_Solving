package SampleProblem;

import java.util.Scanner;

public class numberSeries {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number: ");
	        int n = sc.nextInt();

	        for (int i = 0; i <= n; i++) {
	            String binary = Integer.toBinaryString(i);
	            String num = binary.replace('0', '3').replace('1', '4'); 
	            System.out.print(num + " ");
	        }
	    }
	}