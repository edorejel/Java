package kruskals.algorithm;

import java.util.ArrayList;
import java.util.List;

public class KruskalMSTTest {
	
	// Main method to demonstrate Kruskal's Algorithm
    public static void main(String[] args){
        // Example graph
        int numVertices = 4;
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 6));
        edges.add(new Edge(0, 3, 5));
        edges.add(new Edge(1, 3, 15));
        edges.add(new Edge(2, 3, 4));

        // Compute MST using Kruskal's Algorithm
        List<Edge> mst = KruskalMST.kruskalMST(numVertices, edges);

        // Print the MST
        KruskalMST.printMST(mst);
    }
	
}
