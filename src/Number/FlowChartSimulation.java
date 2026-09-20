package Number;
public class FlowChartSimulation {
    public static void main(String[] args) {
        // Initial box values
        int[] box = {0, 13, 20, 7, 12, 10, 2, 5, 1, 0, 18};
        // index 0 is unused for convenience (so Box1 = index 1)

        // Step A: Box10 = Box4 - Box1
        box[10] = box[4] - box[1];

        // Step B: check if Box10 < 0
        if (box[10] < 0) {
            // Step C: Box2 = Box9 + Box5
            box[2] = box[9] + box[5];

            // Step D: check divisibility
            if (box[2] % box[7] == 0) {
                // Step E: Box3 = Box10 * Box2
                box[3] = box[10] * box[2];
            }
        }

        // Print final values
        System.out.println("Final Box values:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Box " + i + " = " + box[i]);
        }
    }
}