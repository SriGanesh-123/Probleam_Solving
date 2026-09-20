package Task;

public class RearangeFrequency {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
		int count=1;
		int max=0;
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i]==arr[i-1]) {
				count++;
			}else {
				System.out.println(arr[i-1]+ " "+count );
				count=1;
			}
			if(max<count) {
				max=count;
			}
			
		}
		System.out.println(arr[arr.length-1]+" "+count);
		System.out.println(max);

		for (int a : arr) {

			System.out.print(a + " ");
		}

	}
}
/*
 * public static String comp(String s) { if (s == null || s.length() == 0)
 * return ""; int count = 1; StringBuilder result = new StringBuilder(); for
 * (int i = 1; i <= s.length(); i++) { if (i < s.length() && s.charAt(i) ==
 * s.charAt(i - 1)) { count++; } else { result.append(s.charAt(i -
 * 1)).append(count); count = 1; } }
 * 
 * return result.toString(); }
 */