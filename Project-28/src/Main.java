import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        ArrayList<ArrayList<Integer>> arr = graph.graph(10);
        System.out.println(arr.size());
    }
}
