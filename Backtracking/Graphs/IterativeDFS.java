import java.util.*;

public class IterativeDFS {
    public List<Integer> dfsOfGraph(int V, List<List<Integer>> adj) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        stack.push(0); // Start DFS from node 0

        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (!visited[node]) {
                visited[node] = true;
                result.add(node);

                // Add neighbors in reverse order to maintain same order as recursive DFS
                List<Integer> neighbors = adj.get(node);
                for (int i = neighbors.size() - 1; i >= 0; i--) {
                    int neighbor = neighbors.get(i);
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }

        return result;
    }
}
