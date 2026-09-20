package Task;

import java.util.Scanner;

public class Balanced_Half_Digit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		String input=sc.nextLine();
		if(balancer(input)) {
			System.out.println("Balanced ");
			
		}
		else {
			System.out.println("Not Balanced ");
		}
	}

	private static boolean balancer(String input) {
		char[] arr=input.toCharArray();
	 int mid=(arr.length+0)/2;
	  int[] larr=new int[mid];
	  int[] rarr=new int[mid];
	  for(int i=0;i<larr.length;i++) {
		  larr[i]=arr[i];
	  }
	  for(int i=0;i<rarr.length;i++) {
		  rarr[i]=arr[larr.length+i];
	  }
	  int lsum=0;
	  for(int i=0;i<larr.length;i++) {
		  lsum+=larr[i];
	  }
	  int rsum=0;
	  for(int i=0;i<rarr.length;i++) {
		  rsum+=rarr[i];
	  }
	  
	  if(lsum!=rsum) {
		  return false;
	  }
	  
	  
	  
	  return true;
	

}
}
