import java.util.ArrayList;

public class Graph {

    // Initialize main array
    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    // Creates new matrix with empty vertices
    void graph(int v) {
        // Initialize 2d array
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
    }

    // Checks to see if 2 vertices are connected
    boolean isEdge(int v, int w) {
        return graph.get(v).contains(w);
    }

    // Connects 2 vertices
    void addEdge(int v, int w) {
        if (!isEdge(v,w)) {
            graph.get(v).add(w);
            graph.get(w).add(v);
        }
    }
    
    // Finds vertices adjacent to given vertex
    void adj(int v) {
        System.out.print("Node " + v + " -> ");
        for (int i = 0; i < graph.get(v).size(); i++) {
            System.out.print(graph.get(v).get(i) + " ");
        }
        System.out.println();
    }
}
