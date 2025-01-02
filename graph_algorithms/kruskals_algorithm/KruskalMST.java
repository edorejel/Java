package kruskals.algorithm;

import java.util.ArrayList;
import java.util.List;

// Class to represent an edge between two vertices
class Edge {
    int src, dest, weight;

    Edge(int src, int dest, int weight){
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

// Union-Find (Disjoint Set) data structure for cycle detection
class UnionFind {
    int[] parent;
    int[] rank;

    UnionFind(int size){
        parent = new int[size];
        rank = new int[size];
        for(int i=0; i<size; i++){
            parent[i] = i;
            rank[i] = 0;
        }
    }

    // Find the root of the set in which element k is present
    int find(int k){
        if(parent[k] != k){
            parent[k] = find(parent[k]); // Path compression
        }
        return parent[k];
    }

    // Union of two sets by rank
    void union(int x, int y){
        int xRoot = find(x);
        int yRoot = find(y);

        if(xRoot == yRoot){
            return;
        }

        // Attach smaller rank tree under root of higher rank tree
        if(rank[xRoot] < rank[yRoot]){
            parent[xRoot] = yRoot;
        }
        else if(rank[xRoot] > rank[yRoot]){
            parent[yRoot] = xRoot;
        }
        else{
            parent[yRoot] = xRoot;
            rank[xRoot]++;
        }
    }
}

// Main class implementing Kruskal's Algorithm
public class KruskalMST {

    // Merge Sort to sort edges based on their weights
    public static void mergeSort(List<Edge> edges, int left, int right) {
        if(left < right){
            int mid = left + (right - left) / 2;
            mergeSort(edges, left, mid);
            mergeSort(edges, mid + 1, right);
            merge(edges, left, mid, right);
        }
    }

    private static void merge(List<Edge> edges, int left, int mid, int right){
        // Sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        List<Edge> L = new ArrayList<>();
        List<Edge> R = new ArrayList<>();

        for(int i=0; i<n1; i++)
            L.add(edges.get(left + i));
        for(int j=0; j<n2; j++)
            R.add(edges.get(mid + 1 + j));

        // Merge the temp arrays back into edges[left..right]
        int i=0, j=0;
        int k = left;
        while(i < n1 && j < n2){
            if(L.get(i).weight <= R.get(j).weight){
                edges.set(k, L.get(i));
                i++;
            }
            else{
                edges.set(k, R.get(j));
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[], if any
        while(i < n1){
            edges.set(k, L.get(i));
            i++;
            k++;
        }

        // Copy remaining elements of R[], if any
        while(j < n2){
            edges.set(k, R.get(j));
            j++;
            k++;
        }
    }

    // Kruskal's Algorithm to find MST
    public static List<Edge> kruskalMST(int numVertices, List<Edge> edges){
        List<Edge> result = new ArrayList<>();

        // Step 1: Sort all the edges in non-decreasing order of their weight
        mergeSort(edges, 0, edges.size() - 1);

        // Step 2: Create a Union-Find structure
        UnionFind uf = new UnionFind(numVertices);

        // Step 3: Iterate through sorted edges and construct MST
        for(Edge edge : edges){
            int x = uf.find(edge.src);
            int y = uf.find(edge.dest);

            // If including this edge doesn't cause a cycle, include it in result
            if(x != y){
                result.add(edge);
                uf.union(x, y);
            }

            // If we have enough edges for MST, break
            if(result.size() == numVertices - 1){
                break;
            }
        }

        return result;
    }

    // Helper method to print the MST
    public static void printMST(List<Edge> mst){
        System.out.println("Edges in the Minimum Spanning Tree:");
        for(Edge edge : mst){
            System.out.println(edge.src + " -- " + edge.dest + " == " + edge.weight);
        }
    }
}
