package Task;

import java.util.Scanner;

public class BubbleSort_String {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter t he Size of Array : ");
		int n= sc.nextInt();
		sc.nextLine();
		String[] arr=new String[n];
		System.out.println("Enter the Elements in String Format : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextLine();
		}
		
		bubblesort(arr);
		for( String a :arr) {
			System.out.println(a);
		}
	
	}

	private static void bubblesort(String[] arr) {
		int a= arr.length;
		for(int i=0;i<a;i++) {
			for(int j=0;j<a-1-i;j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}

}
