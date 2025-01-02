package prims.algorithm;

import java.util.*;

class PrimAlgorithm {
    static class Edge {
        int node;
        int weight;

        Edge(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    public static void primMST(int vertices, List<List<Edge>> graph) {
        // Priority queue to store edges with minimum weight at the top
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));

        boolean[] visited = new boolean[vertices];
        int[] parent = new int[vertices]; // To store the MST
        int[] key = new int[vertices]; // To track the minimum weight edge to each node

        // Initialize all keys as infinity and parent as -1
        Arrays.fill(key, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);

        // Start from the first vertex (index 0)
        key[0] = 0;
        pq.offer(new Edge(0, 0));

        while (!pq.isEmpty()) {
            // Pick the smallest edge
            int current = pq.poll().node;
            visited[current] = true;

            // Explore all neighbors
            for (Edge edge : graph.get(current)) {
                if (!visited[edge.node] && edge.weight < key[edge.node]) {
                    key[edge.node] = edge.weight;
                    pq.offer(new Edge(edge.node, edge.weight));
                    parent[edge.node] = current;
                }
            }
        }

        // Print the MST
        System.out.println("Edge\tWeight");
        for (int i = 1; i < vertices; i++) {
            System.out.println(parent[i] + " - " + i + "\t" + key[i]);
        }
    }

    
}
