package Function;
public class TowersOfHanoi {

    // Recursive function to calculate minimum moves
    public static int hanoiMoves(int n) {
        if (n == 1) return 1; // Base case: only 1 disk
        return 2 * hanoiMoves(n - 1) + 1; // Move n-1 disks, move largest disk, move n-1 disks
    }

    public static void main(String[] args) {
        int disks = 3;
        int minMoves = hanoiMoves(disks);
        System.out.println("Minimum moves required for " + disks + " disks: " + minMoves);
    }
}
