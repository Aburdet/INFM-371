public class Main {

    public static void main(String[] args) {
        // Create matrix
        Graph graph = new Graph();
        graph.graph(7);

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,5);
        graph.addEdge(0,6);
        graph.addEdge(3,4);
        graph.addEdge(3,5);
        graph.addEdge(4,5);
        graph.addEdge(4,6);

        for (int i = 0; i < graph.graph.size(); i++) {
            System.out.println("Node " + i + " -> " + graph.graph.get(i));
        }
    }
}
