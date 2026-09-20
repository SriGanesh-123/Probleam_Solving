package Arrays;

public class ZeroLast {

	public static void main(String args[]) {
	int[] a= {0,3,9,0,4,3};
	int index=0;
	for (int i = 0;i<a.length;i++) {
		if(a[i]!=0) {
			int temp=a[i];
			a[i]=a[index];
			a[index]=temp;
			index++;
		}
		}
	for (int n : a ) {
		System.out.print(n + " ");
	}
	
	}

}


