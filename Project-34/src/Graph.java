import java.util.ArrayList;

public class Graph {

    // Initialize main array
    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    ArrayList<Integer> output = new ArrayList<>();
    ArrayList<Integer> stack = new ArrayList<>();

    // Number of edges
    int count;

    void OS(ArrayList<Integer> output, ArrayList<Integer> stack) {
        //
    }

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
            count++;
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
        return count;
    }

    void DFS(Graph G, int v) {
        int temp = 0;
        if (!output.contains(v)) {
            output.add(v);
        }
        for (int i = 0; i < graph.size(); i++) {
            if (isEdge(v,i) && !output.contains(i) && temp == 0) {
                output.add(i);
                temp++;
            }
            else if (isEdge(v,i) && !output.contains(i) && !stack.contains(i)) {
                stack.add(i);
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            if (output.contains(stack.get(i))) {
                stack.remove(i);
            }
        }
    }

    ArrayList<ArrayList<Integer>> detach(int v) {
        int w;
        while (graph.get(v).size() > 0) {
            w = graph.get(v).get(0);
            graph.get(w).remove(Integer.valueOf(v));
            graph.get(v).remove(0);
        }
        return graph;
    }
}
