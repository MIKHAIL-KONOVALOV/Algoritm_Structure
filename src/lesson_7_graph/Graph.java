package lesson_7_graph;

/**
 * @author Mihail
 * Created on 04.05.2020
 * <p>
 * This interface ...
 */

public interface Graph {

    void addVertex(String label);

    boolean addEdge(String startLabel, String endLabel);

    int getSize();

    void display();

    void dfs(String startLabel); //Depth-first search

    void bfs(String startLabel); //Breadth-first search
}
