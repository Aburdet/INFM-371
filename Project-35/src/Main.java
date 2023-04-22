import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();

        ArrayList<Integer> oldStack = new ArrayList<>();
        oldStack.add(8);
        oldStack.add(3);
        oldStack.add(9);

        ArrayList<Integer> adjacent = new ArrayList<>();
        adjacent.add(10);
        adjacent.add(2);

        System.out.println(oldStack);
        ArrayList<Integer> newStack = graph.stack(oldStack, adjacent);
        System.out.println(newStack);
    }
}
