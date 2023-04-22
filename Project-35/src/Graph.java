import java.util.ArrayList;

public class Graph {

    ArrayList<Integer> stack(ArrayList<Integer> oldStack, ArrayList<Integer> adjacent) {
        ArrayList<Integer> newStack = oldStack;
        for (int i = 0; i < adjacent.size(); i++) {
            if (!oldStack.contains(adjacent.get(i))) {
                newStack.add(adjacent.get(i));
            }
            else {
                newStack.remove(adjacent.get(i));
                newStack.add(adjacent.get(i));
            }
        }
        return newStack;
    }
}
