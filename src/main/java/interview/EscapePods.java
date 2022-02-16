package interview;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class EscapePods {
    private static final int MAX_FLOW = 2000001;

    // Uses Ford-Fulkerson algorithm for finding max flow in a graph
    public static int solution(int[] entrances, int[] exits, int[][] path) {
        int[][] residual_network = buildNetwork(entrances, exits, path);

        int maxFlow = 0;
        List<Integer> flowPath;
        while ((flowPath = bfs(residual_network)) != null) {
            int residual_capacity = MAX_FLOW;
            int u = 0;
            for (int v : flowPath) {
                residual_capacity = Math.min(residual_capacity, residual_network[u][v]);
                u = v;
            }

            maxFlow += residual_capacity;
            u = 0;
            for (int v : flowPath) {
                residual_network[u][v] -= residual_capacity;
                residual_network[v][u] += residual_capacity;
                u = v;
            }
        }
        return maxFlow;
    }

    // merge entrances and exits into super-entrance, -exit
    private static int[][] buildNetwork(int[] entrances, int[] exits, int[][] path) {
        int n = path.length;
        int extendedSize = n + 2;
        int[][] network = new int[extendedSize][extendedSize];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                network[i + 1][j + 1] = path[i][j];

        for (int exit : exits)
            network[exit + 1][extendedSize - 1] = MAX_FLOW;
        for (int entrance : entrances)
            network[0][entrance + 1] = MAX_FLOW;

        return network;
    }

    // search paths from entrance to exit that matches criteria
    private static List<Integer> bfs(int[][] residual_network) {
        int[] parents = new int[residual_network.length];
        Arrays.fill(parents, -1);
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        int u;
        while (!queue.isEmpty() && parents[parents.length - 1] == -1) {
            u = queue.remove();
            for (int v = 0; v < parents.length; v++) {
                if (residual_network[u][v] > 0 && parents[v] == -1) {
                    queue.add(v);
                    parents[v] = u;
                }
            }
        }
        List<Integer> path = new ArrayList<>();
        u = parents[parents.length - 1];
        while (u != 0) {
            if (u == -1) return null;
            path.add(u);
            u = parents[u];
        }
        Collections.reverse(path);
        return path;
    }

}
