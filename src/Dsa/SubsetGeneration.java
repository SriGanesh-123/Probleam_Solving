package Dsa;
public class SubsetGeneration {
    public static void generateSubsets(int[] arr) {
        int n = arr.length;
        int total = 1 << n; // 2^n subsets

        for (int mask = 0; mask < total; mask++) {
            System.out.print("{ ");
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println("}");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        generateSubsets(arr);
    }
}
