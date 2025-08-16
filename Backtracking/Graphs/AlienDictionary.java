
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class AlienDictionary {
    private List<Integer> topoSort(List<List<Integer>> adj, int V){
        Queue<Integer> que = new LinkedList<>();
        int[] indegree = new int[V];
        for (int i = 0; i < V; i++){
           for (int adjNode : adj.get(i)){
                indegree[adjNode]++;
           }
        }
        for (int i = 0; i < V; i++){
            if (indegree[i] == 0) que.add(i);
        }
        List<Integer> topo = new ArrayList<>();
        while (!que.isEmpty()){
            int node = que.peek();
            topo.add(node);
            que.remove();
            for (int adjNode : adj.get(node)){
                indegree[adjNode]--;
                if (indegree[adjNode] == 0) que.add(adjNode);
            }
        }
        return topo;
    }
public String findOrder(String[] words, int N, int K){
    List<List<Integer>> adj = new ArrayList<>();
    for (int i = 0; i < K; i++){
      adj.add(new ArrayList<>());
    }

    for (int i = 0; i < N - 1; i++){
        String s1 = words[i];
        String s2 = words[i + 1];
        int len = Math.min(s1.length(), s2.length());
        for (int j = 0; j < len; j++){
            if (s1.charAt(j) != s2.charAt(j)){
            adj.get(s1.charAt(j) - 'a').add(s2.charAt(j) - 'a');
            break;
            }
        }
    }
    List<Integer> ans = topoSort(adj, K);
    StringBuilder anss = new StringBuilder();
    for (int node : ans){
        anss.append((char)(node + 'a'));
    }
    return anss.toString();
}
}
