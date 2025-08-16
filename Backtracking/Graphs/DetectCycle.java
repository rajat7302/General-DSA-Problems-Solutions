
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class Pair{
    int first;
    int second;
    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
public class DetectCycle {
    private boolean dfs(int node, int parent, int[] vis, List<List<Integer>> adj){
        vis[node] = 1;
        for (int adjacentNode : adj.get(node)){
            if (vis[adjacentNode] == 0)
                if (dfs(adjacentNode, node, vis, adj)) return true;
            else if (adjacentNode != parent) return true;
        }
        return false;
    }
    public boolean isCycle(List<List<Integer>> adj, int V){
         int[] vis = new int[V];
         for (int i = 0; i < V; i++){
            if (vis[i] == 0)
            if (dfs(1, -1, vis, adj)) return true;
         }
         return false;
    }
    private boolean checkForCycle(int src, int V, List<List<Integer>> adj, boolean[] vis){
        vis[src] = true;
        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(src, -1));
        while (!que.isEmpty()){
            int node = que.peek().first;
            int parent = que.peek().second;
            que.remove();
            for (int adjacentNode : adj.get(node)){
            if (vis[adjacentNode]== false){
                vis[adjacentNode] = true;
                que.add(new Pair(adjacentNode, node));
            }
            else if (parent != adjacentNode)return true;
            }
        }
        return false;
    }
    public boolean isCycle(int V, List<List<Integer>> adj){
        boolean[] vis = new boolean[V];
        for (int i = 0; i < V; i++){
            if (!vis[i]){
                if (checkForCycle(i, V, adj, vis)) return true;
            }
        }
        return false;
    }
}
