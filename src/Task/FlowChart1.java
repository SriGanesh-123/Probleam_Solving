package Task;

import java.util.Scanner;

public class FlowChart1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the size :");
//		int n=sc.nextInt();
//		int [] box= new int[n];
//		System.out.println("Enter the Elements : ");
//		for(int i=0 ;i<n;i++) {
//			box[i]=sc.nextInt();
//		}
		int[] box = {0, 13, 20, 7, 12, 10, 2, 5, 1, 0, 18};
		box[10]=box[4]-box[1];
		if(box[10]<0) {
			box[2]=box[9]+box[5];
		}
		if(box[2]>box[7]) {
			box[3]=box[10]*box[2];
		}
		for( int i=1;i<=10;i++) {
			System.out.println("Box" +i+ " =" +box[i]);
		}
		
	}

}
