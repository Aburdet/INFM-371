public class Main {

    public static void main(String[] args) {
        // Create matrix
        Graph graph = new Graph();
        graph.graph(7);

        // Add edges of graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 5);
        graph.addEdge(0, 6);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);
        graph.addEdge(4, 6);

        // Prints adjacent vertices of given vertex

        System.out.println("Vertex " + 1 + " -> " + graph.adj(1));
        System.out.println("Vertex " + 4 + " -> " + graph.adj(4));
        System.out.println("Number of vertices: " + graph.V());
        System.out.println("Number of edges: " + graph.E());
    }
}
