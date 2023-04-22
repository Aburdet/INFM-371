import java.util.ArrayList;

public class Graph {

    // Creates new matrix with empty nodes
    ArrayList<ArrayList<Integer>> graph(int v) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
        return graph;
    }
}
