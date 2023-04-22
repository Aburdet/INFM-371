import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        ArrayList<ArrayList<Integer>> arr = graph.graph(7);

        // Node 0
        arr.get(0).add(1);
        arr.get(0).add(2);
        arr.get(0).add(5);
        arr.get(0).add(6);

        // Node 1
        arr.get(1).add(0);

        // Node 2
        arr.get(2).add(0);

        // Node 3
        arr.get(3).add(4);
        arr.get(3).add(5);

        // Node 4
        arr.get(4).add(4);
        arr.get(4).add(5);
        arr.get(4).add(6);

        // Node 5
        arr.get(5).add(3);
        arr.get(5).add(4);

        // Node 6
        arr.get(6).add(0);
        arr.get(6).add(4);

        System.out.println(graph.isEdge(0,1));
        System.out.println(graph.isEdge(0,4));
        System.out.println(graph.isEdge(5,3));
    }
}
