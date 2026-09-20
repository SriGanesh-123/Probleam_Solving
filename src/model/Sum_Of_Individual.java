package model;
import java.util.Scanner;
public class Sum_Of_Individual {
public static void main(String args[]) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the Input Number : ");
		int input = sc.nextInt();
		sc.nextLine();
		/*int sum=0;
		while(input>0) {
		sum+=input%10;
		input/=10;
		}
		System.out.println(sum);*/
		System.out.println(SumofD(input));
		
	}
}
static int SumofD(int n) {
	if(n==0)
		return 0;
	
	return (n%10)+SumofD(n/10);
}
}
