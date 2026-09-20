package SampleProblem;

import java.util.Scanner;

public class P {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		int input = sc.nextInt();
//		int total=fact(input);
	//	int a=1;
		int num = 1;
		for (int i = 1; i <= input; i++) {
			for (int j = i; j <= input; j++) {
				System.out.print (num++ + "  ");

			}
			
			System.out.println();
		}
		
//		for(int i=1;i<=input;i++){
//			for(int j=i;j<=input;j++) {
//				for(int k=0;k<=input;k++) {
//					System.out.println(num++  + " ");
//				}
//			}
//			
//		}
		
//		for (int i = 0; i <input; i++) {
//			int num = 1;
//			for( int j=i;j<=input-1;j++)
//			{
//			
//					
//				
//				while(num<=total) {
//					
//				System.out.print(num + "  ");
//				num=num+input-i++;
//				//int z=1;
//			}
//				
//				
//				System.out.println();
//				while(num <=total-1 ) {
//					num=2;
//					System.out.print(num + "  ");
//					num=num+input-i++;
//				}
////				while(num<total-1) {
////					num++;
////					System.out.print(num + " ");
////					num=num+input-1;
////					
////				}
  				
			//}
			
			//System.out.println();
}
}
	
	
//	public static int fact(int i ) {
//		
//		if(  i==1) {
//		return 1;
//		}
//		
//		//System.out.println(i);
//		//fact(i-1);
//
//		return i + fact(i-1) ;
//	}
