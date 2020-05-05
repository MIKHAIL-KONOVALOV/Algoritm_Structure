package lesson_7_graph;

/**
 * @author Mihail
 * Created on 04.05.2020
 */
public class Main7 {
    public static void main(String[] args) {
        Graph graph = new GraphImplementation(5);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");

        graph.addEdge("A","B");
        graph.addEdge("A","C");

        graph.addEdge("B","A");
        graph.addEdge("B","C");
        graph.addEdge("B","D");

        graph.addEdge("C","A");
        graph.addEdge("C","B");
        graph.addEdge("C","D");

        graph.addEdge("D","B");
        graph.addEdge("D","C");

        graph.addEdge("E","D");

        System.out.println("Graph size = " + graph.getSize());
        graph.display();
        graph.dfs("C");
    }
}
