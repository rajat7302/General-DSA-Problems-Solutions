
import java.util.ArrayList;
import java.util.List;


public class DFSGraphs {
    public static void dfs(int node, boolean[] vis, List<List<Integer>> adj, List<Integer> list){
        vis[node] = true;
        list.add(node);
        for (int it : adj.get(node)){
            if (!vis[it]) dfs(it, vis, adj, list);
        }
    }
    public List<Integer> dfsOfGraph(int V, List<List<Integer>> adj){
      boolean vis[] = new boolean[V + 1];
      vis[0] = true;
      List<Integer> list = new ArrayList<>();
      dfs(0, vis, adj, list);
      return list;
    }
}
