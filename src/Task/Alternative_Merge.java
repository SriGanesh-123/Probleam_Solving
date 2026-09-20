package Task;

public class Alternative_Merge {
	public static void main(String[] args) {
		String s1="abcytuio";
		String s2="pqrstu";
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		
		alternate(arr1,arr2);
	}

	private static void alternate(char[] arr1, char[] arr2) {
		int i=0,j=0;
		while(i<arr1.length && j<arr2.length) {
			System.out.print(arr1[i++]+ " ");
			System.out.print(arr2[j++]+ " ");
			
		}
		while(i<arr1.length) {
			System.out.print(arr1[i++]+ " ");
		}
		while(j<arr2.length) {
			System.out.print(arr2[j++]+ " ");
		}
		
	}

}
