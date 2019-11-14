import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @program: algorithms
 * @author: Programming Queen
 * @create: 2019-11-14 09:14
 **/

public class ShortestReach {
    public static class Graph {
        private Node[] nodes;
        private static int EDGE_DISTANCE = 6;

        private class Node {
            ArrayList<Integer> neighbors;
        }

        private Node getNode(int id) {
            return null;
        }

        public void addEdge(int first, int second) {
        }

        public int[] shortestReach(int startId) {
            // Use BFS
            LinkedList<Integer> queue = new LinkedList<>();
            queue.add(startId);

            int[] distances = new int[nodes.length];
            Arrays.fill(distances, -1);

            while (!queue.isEmpty()) {
                int node = queue.poll();
                for (int neighbor : nodes[node].neighbors) {
                    if (distances[neighbor] == -1) {
                        distances[neighbor] = distances[node] + EDGE_DISTANCE;
                        queue.add(neighbor);
                    }
                }
            }

            return distances;
        }
    }

}

