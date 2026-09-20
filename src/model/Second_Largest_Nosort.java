package model;
import java.util.Scanner;
public class Second_Largest_Nosort {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size : ");
	int size = sc.nextInt();
	
	int []a=new int[size];
	int asize=a.length;
	for (int i=0 ; i<size;i++)
	{
		System.out.println("Enter the elenents :" );
		a[i]=sc.nextInt();
	}
	int max=a[0];
	int max2=0;
	for (int i=1;i<asize;i++)
	{
	     if(a[i]>max)
		{
	    	 max2=max;
			max=a[i];
			
		}
	     else if (a[i]>max2&&a[i]!=max)
		  {
			max2=a[i];
		}
		
		
		
	}
	for (int d : a) 
	{
		System.out.print(d +" ");
	}
	
	
	System.out.println("\n "+max);
	System.out.println(" "+max2 );

}
}
