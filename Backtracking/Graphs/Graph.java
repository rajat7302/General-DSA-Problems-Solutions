
public class Graph {
    public static void main(String args[]){
        int[][] graph = new int[4][4];
        //Using adjacency matrix and that is easy using it
        graph[2][3] = 4;
        //This line implies there is an edge between 2 and 3 whose weight is 4
        graph[3][3] = 7;
        graph[2][1] = 8;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
