package Function;
public class TowersOfHanoiStep {

    // Recursive function to solve Towers of Hanoi and print moves
    public static int solveHanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n == 0) return 0; // no disk to move

        int moves = 0;

        // Move n-1 disks from 'fromRod' to 'auxRod'
        moves += solveHanoi(n - 1, fromRod, auxRod, toRod);

        // Move the largest disk from 'fromRod' to 'toRod'
        System.out.println("Move disk " + n + " from " + fromRod + " to " + toRod);
        moves++; // count this move

        // Move n-1 disks from 'auxRod' to 'toRod'
        moves += solveHanoi(n - 1, auxRod, toRod, fromRod);

        return moves;
    }

    public static void main(String[] args) {
        int disks = 3;
        int totalMoves = solveHanoi(disks, 'A', 'C', 'B'); // A = source, C = target, B = auxiliary
        System.out.println("Total moves: " + totalMoves);
    }
}
