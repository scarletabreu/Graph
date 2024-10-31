import Classes.Graph;
import Classes.Node;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        // Crear nodos
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");
        Node F = new Node("F");
        Node G = new Node("G");
        Node H = new Node("H");
        Node I = new Node("I");

        // Añadir vértices
        graph.addVertex(A);
        graph.addVertex(B);
        graph.addVertex(C);
        graph.addVertex(D);
        graph.addVertex(E);
        graph.addVertex(F);
        graph.addVertex(G);
        graph.addVertex(H);
        graph.addVertex(I);

        // Añadir aristas (considerando un peso de 1 para cada arista)
        graph.addEdge(A, B, 1);
        graph.addEdge(A, C, 1);
        graph.addEdge(B, D, 1);
        graph.addEdge(B, E, 1);
        graph.addEdge(C, F, 1);
        graph.addEdge(C, G, 1);
        graph.addEdge(D, E, 1);
        graph.addEdge(D, H, 1);
        graph.addEdge(E, I, 1);
        graph.addEdge(F, G, 1);
        graph.addEdge(G, H, 1);
        graph.addEdge(H, I, 1);
        graph.addEdge(I, F, 1);

        // Imprimir el grafo
        graph.printGraph();

        // Calcular los grados de los nodos
        graph.calculateDegrees();
    }
}
