import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Define array
        int[][] arr = {
                {1,2,5,6},
                {0},
                {0},
                {4,5},
                {3,5,6},
                {3,4},
                {0,4}
        };
        // Print adjacent nodes to every node in array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Node " + i + " -> " + Arrays.toString(arr[i]));
        }
    }
}
