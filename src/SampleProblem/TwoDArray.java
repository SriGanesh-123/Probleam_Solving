package SampleProblem;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String arr[][] = { { "luke", "shaw" }, { "wayne", "rooney" }, { "rooney", "ronaldo" }, { "shaw", "rooney" } };
		System.out.println("Enter the choice : ");
		String search = sc.nextLine();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][1].equals(search)) {
				String result = arr[i][0];
				for (int j = 0; j < arr.length; j++) {
					if (arr[j][1].equals(result)) {
						count++;

					}
				}

			}
		}
		System.out.println("count : " + count);
		sc.close();
	}

}
