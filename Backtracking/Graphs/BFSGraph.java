import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class BFSGraph {
    public List<Integer> bfs(List<List<Integer>> adj, int V){
        List<Integer> bfs = new ArrayList<>();
        boolean visited[] = new boolean[V];
        Queue<Integer> que = new LinkedList<>();
        que.add(0);
        visited[0] = true;
        while (!que.isEmpty()){
        int node = que.poll();
        bfs.add(node);
        for (int it : adj.get(node)){
            if (!visited[it]){
                visited[it] = true;
                que.add(it);
            }
        }
        }
        return bfs;
    }
    public List<Integer> bfsDisconnected(List<List<Integer>> adj, int V){
    List<Integer> bfs = new ArrayList<>();
    boolean[] visited = new boolean[V];//This also works for disconnected edges also so do it properly 
    for (int i = 0; i < V; i++) {
        if (!visited[i]) {
            Queue<Integer> que = new LinkedList<>();
            que.add(i);
            visited[i] = true;
            
            while (!que.isEmpty()) {
                int node = que.poll();
                bfs.add(node);
                for (int it : adj.get(node)) {
                    if (!visited[it]) {
                        visited[it] = true;
                        que.add(it);
                    }
                }
            }
        }
    }
    return bfs;
}

}
