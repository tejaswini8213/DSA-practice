import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int[][] adjacencyList = {
                {1, 3},
                {0},
                {3, 8},
                {0, 2, 4, 5},
                {3, 6},
                {3},
                {4, 7},
                {6},
                {2}
        };
        ArrayList<Integer> traversalBFS = traversalBFS(adjacencyList);
        System.out.println(traversalBFS);
    }

    public static ArrayList<Integer> traversalBFS(int[][] graph) {
        HashMap<Integer, Boolean> seen = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> values = new ArrayList<>();
        queue.add(0);
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            values.add(vertex);
            seen.put(vertex, true);
            int[] connections = graph[vertex];
            for (int i = 0; i < connections.length; i++) {
                int connection = connections[i];
                if (!seen.containsKey(connection)) {
                    queue.add(connection);
                }
            }
        }
        return values;
    }
}
