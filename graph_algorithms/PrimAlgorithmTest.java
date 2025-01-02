package prims.algorithm;

import java.util.ArrayList;
import java.util.List;

import prims.algorithm.PrimAlgorithm.Edge;

public class PrimAlgorithmTest {
	
	public static void main(String[] args) {
        int vertices = 5;

        // Create a graph with adjacency list
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges (undirected graph)
        graph.get(0).add(new Edge(1, 2));
        graph.get(0).add(new Edge(3, 6));
        graph.get(1).add(new Edge(0, 2));
        graph.get(1).add(new Edge(2, 3));
        graph.get(1).add(new Edge(3, 8));
        graph.get(1).add(new Edge(4, 5));
        graph.get(2).add(new Edge(1, 3));
        graph.get(2).add(new Edge(4, 7));
        graph.get(3).add(new Edge(0, 6));
        graph.get(3).add(new Edge(1, 8));
        graph.get(4).add(new Edge(1, 5));
        graph.get(4).add(new Edge(2, 7));

        PrimAlgorithm.primMST(vertices, graph);
    }
}
