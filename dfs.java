import java.util.ArrayList;
import java.util.List;

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
        List<Integer> values = new ArrayList<>();
        traversalDFS(0, adjacencyList, values, new boolean[adjacencyList.length]);
        System.out.println(values);
    }

    public static void traversalDFS(int vertex, int[][] graph, List<Integer> values, boolean[] seen) {
        values.add(vertex);
        seen[vertex] = true;
        int[] connections = graph[vertex];
        for (int i = 0; i < connections.length; i++) {
            int connection = connections[i];
            if (!seen[connection]) {
                traversalDFS(connection, graph, values, seen);
            }
        }
    }
}
