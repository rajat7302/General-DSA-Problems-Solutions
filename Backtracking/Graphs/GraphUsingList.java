
import java.util.ArrayList;
import java.util.List;
public class GraphUsingList {
  public static void main(String[] args) {
      List<List<Integer>> graph = new ArrayList<>();
     int n = 101;// The number of edges of it - 1
     for (int i = 0; i <= 100; i++){
     graph.add(new ArrayList<>());
     }
     graph.get(3).add(2);
     graph.get(2).add(3);
     //This represents an indirected graph with 3 -> 2 and 2 -> 3
     for (int i = 0; i <= 100; i++){
        int size = graph.get(i).size();
        for (int j = 0; j < size ;j++){
            System.out.print(graph.get(i)+ " ");
        }
        System.out.println();
     }
  }} 
