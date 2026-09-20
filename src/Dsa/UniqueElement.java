package Dsa;
public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 2};
        int unique = 0;
        for (int num : arr) {
            unique ^= num;
        }
        System.out.println("Unique element: " + unique);
    }
}
