package SampleProblem;

import java.util.Scanner;

public class NumberToAlphabet {
  
    public static String convertToAlphabet(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            n--;  
            int remainder = n % 26;
            result.insert(0, (char) ('A' + remainder));
            n /= 26;
        }

        return result.toString();
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number : ");
    	int n = sc.nextInt() ;
        int[] testNumbers = {1, 26, 27, 52, 676, 702, 703, 18278};
        System.out.println(convertToAlphabet(n));
        for (int num : testNumbers) {
            System.out.println(num + " -> " + convertToAlphabet(num));
        }
    }
}
