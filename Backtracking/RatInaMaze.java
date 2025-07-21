import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class RatInaMaze {
    private void backtrack(int grid[][], StringBuilder ds, List<String> ans, int r, int c, int row, int column, boolean visited[][])
    {
        if (r < 0 || c < 0 || r >= row || c >= column || grid[r][c] == 0 || visited[r][c]) return;
        if (r == row - 1 && c == column - 1)
        {
            ans.add(ds.toString());
            return;
        }
         visited[r][c] = true;
        ds.append("D");
        backtrack(grid, ds, ans, r + 1, c, row, column, visited);
        ds.deleteCharAt(ds.length() -1 );

        ds.append("U");
        backtrack(grid, ds, ans, r - 1, c, row, column, visited);
        ds.deleteCharAt(ds.length() -1);

        ds.append("L");
        backtrack(grid, ds, ans, r, c - 1, row, column, visited);
        ds.deleteCharAt(ds.length() -1 );

        ds.append("R");
        backtrack(grid, ds, ans, r, c + 1, row, column, visited);
        ds.deleteCharAt(ds.length() - 1);
        visited[r][c] = false;
    }
    public List<String> solveMaze(int grid[][])
    {
        int row = grid.length;
        int column = grid[0].length;
        boolean visited[][] = new boolean[row][column];
        List<String> ans = new ArrayList<>();
        backtrack(grid, new StringBuilder(), ans, 0, 0, row, column, visited);
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        RatInaMaze ob = new RatInaMaze();
        int grid[][] = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};
        int row = grid.length, column = grid[0].length;
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < column; j++)
            {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("The path is " + ob.solveMaze(grid));
    }
}
