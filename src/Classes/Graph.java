package Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private final Map<Node, List<Edge>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    public void addVertex(Node node) {
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(Node start, Node end, int weight) {
        Edge edge = new Edge(start, end, weight);
        adjacencyList.get(start).add(edge);
        adjacencyList.get(end).add(new Edge(end, start, weight));
    }

    public Map<Node, List<Edge>> getAdjacencyList() {
        return adjacencyList;
    }

    public void printGraph() {
        for (Node node : adjacencyList.keySet()) {
            System.out.print(node.getName() + ": ");
            for (Edge edge : adjacencyList.get(node)) {
                System.out.print("(" + edge.getEnd().getName() + ", " + edge.getWeight() + ") ");
            }
            System.out.println();
        }
    }

    public void calculateDegrees(){
        for (Node node : adjacencyList.keySet()) {
            System.out.println("Grados de " + node.getName() + ": " + adjacencyList.get(node).size());
        }
    }
}
