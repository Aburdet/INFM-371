public class Main {

    public static void main(String[] args) {
        // Create graph
        Graph graph = new Graph();
        graph.graph(11);

        // Add edges of graph
        graph.addEdge(5,1);
        graph.addEdge(5,3);
        graph.addEdge(5,4);
        graph.addEdge(5,8);
        graph.addEdge(1,9);
        graph.addEdge(1,4);
        graph.addEdge(4,2);
        graph.addEdge(4,10);
        graph.addEdge(2,6);
        graph.addEdge(6,9);
        graph.addEdge(6,8);
        graph.addEdge(8,7);
        graph.addEdge(8,3);
        graph.addEdge(3,10);

        graph.DFS(graph,5);
        graph.DFS(graph,1);
        graph.DFS(graph,4);
        graph.DFS(graph,2);
        graph.DFS(graph,6);
        graph.DFS(graph,8);
        graph.DFS(graph,3);
        graph.DFS(graph,7);

        System.out.println(graph.detach(4));
    }
}
