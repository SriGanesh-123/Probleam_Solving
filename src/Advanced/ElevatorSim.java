package Advanced;
import java.util.*;
public class ElevatorSim {
    enum Dir {UP, DOWN, IDLE}
    static class Elevator {
        int currentFloor = 0;
        Dir direction = Dir.IDLE;
        TreeSet<Integer> upRequests = new TreeSet<>();
        TreeSet<Integer> downRequests = new TreeSet<>(Comparator.reverseOrder());

        public void request(int floor) {
            if (floor > currentFloor) upRequests.add(floor);
            else if (floor < currentFloor) downRequests.add(floor);
            else {
                // same floor: simulate immediate pickup/drop
                System.out.println("Served at floor " + floor);
            }
            if (direction == Dir.IDLE) decideDirection();
        }

        private void decideDirection() {
            if (!upRequests.isEmpty()) direction = Dir.UP;
            else if (!downRequests.isEmpty()) direction = Dir.DOWN;
            else direction = Dir.IDLE;
        }

        public void step() {
            if (direction == Dir.UP) {
                Integer next = upRequests.ceiling(currentFloor+1);
                if (next == null) { // no more up
                    if (!downRequests.isEmpty()) direction = Dir.DOWN;
                    else direction = Dir.IDLE;
                    return;
                }
                currentFloor++;
                System.out.println("Moved up to " + currentFloor);
                if (upRequests.contains(currentFloor)) {
                    upRequests.remove(currentFloor);
                    System.out.println("Stopped at " + currentFloor);
                }
            } else if (direction == Dir.DOWN) {
                Integer next = downRequests.floor(currentFloor-1);
                if (next == null) {
                    if (!upRequests.isEmpty()) direction = Dir.UP;
                    else direction = Dir.IDLE;
                    return;
                }
                currentFloor--;
                System.out.println("Moved down to " + currentFloor);
                if (downRequests.contains(currentFloor)) {
                    downRequests.remove(currentFloor);
                    System.out.println("Stopped at " + currentFloor);
                }
            } else {
                System.out.println("Idle at " + currentFloor);
            }
            if (upRequests.isEmpty() && downRequests.isEmpty()) direction = Dir.IDLE;
        }
    }

    public static void main(String[] args) {
        Elevator e = new Elevator();
        e.request(3);
        e.request(1);
        e.request(5);
        for (int i = 0; i < 10; i++) e.step();
    }
}
