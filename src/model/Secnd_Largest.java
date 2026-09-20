package model;
import java.util.Arrays;
public class Secnd_Largest {
public static void main(String args[]) {
	int[] a= {12,3,4,2,15,19,0};
	
	//With build in function .
	/*Arrays.sort(a);
	//int length=a.length;
	int k=2;
	int max2=a[a.length-k];
	System.out.println(max2);
	*/
	
	
	// without build in function .
	
	int max=a[0];
	for (int i=0;i<a.length-1;i++) {
		if(a[i]>a[i+1]) {
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			i=-1;
		}	
	}
	int k=2;
	int max2=a[a.length-k];
	System.out.println(max2);
	//for(int b : a) {
//		System.out.println(b);
	//}
	
}
}
