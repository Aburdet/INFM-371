import java.util.ArrayList;

public class Graph {

    // Initialize main array
    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    // Creates new matrix with empty nodes
    ArrayList<ArrayList<Integer>> graph(int v) {
        // Initialize 2d array
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
        return graph;
    }

    // Checks to see if 2 nodes are connected
    boolean isEdge(int v, int w) {
        return graph.get(v).contains(w);
    }
}
