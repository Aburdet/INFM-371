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
    ArrayList<Integer> adj(int v) {
        return graph.get(v);
    }

    // Number of vertices
    int V() {
        return graph.size();
    }

    // Number of edges
    int E() {
        int count = 0;
        for (int i = 0; i < V(); i++) {
            for (int j = i+1; j < V(); j++) {
                if (isEdge(i,j)) {
                    count++;
                }
            }
        }
        return count;
    }
}

// You are waived for FE
