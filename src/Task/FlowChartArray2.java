package Task;

public class FlowChartArray2 {
    public static void main(String[] args) {
        int[] box = {0, 13, 20, 7, 12, 10, 2, 5, 1, 0, 18};

        int count = 0; // safeguard to prevent infinite printing

        while (true) {
            // Step A
            box[10] = box[4] - box[1];

            // Step B
            if (box[10] < 0) {
                // Modified Step C: Update Box3 instead of Box2
                box[3] = box[9] + box[5];

                // Step D
                if (box[2] > box[7]) {
                    // Step E
                    box[3] = box[10] * box[2];
                } else {
                    break; // if condition fails, exit loop
                }
            } else {
                break; // exit if Box10 >= 0
            }

            // prevent infinite loop in demo
            count++;
            if (count > 10) {
                System.out.println("Infinite loop detected!");
                break;
            }
        }
    }
}