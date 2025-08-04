
import java.util.ArrayList;
import java.util.List;
public class PalindromePartioning {
    private boolean dp[][];
    private boolean isPalin(String s, int i, int j){
        if (dp[i][j]) return true;
     while(i < j)
     {
        if (s.charAt(i) != s.charAt(j)) return false;
     }
     return dp[i][j] = true;
    }
    private void backtrack(String s, int idx, List<String> ds, List<List<String>> ans, int len)
    {
      if (idx == len)
      {
        ans.add(new ArrayList<>(ds));
        return;
      }
      for (int i = idx; i < len; i++)
      {
        if (isPalin(s, idx, i))
        {
         ds.add(s.substring(idx, i + 1));
         backtrack(s, i + 1, ds, ans, len);
         ds.remove(ds.size() - 1);
         dp[idx][i] = true;
        }
      }
    }
    public List<List<String>> palindromelist(String s)
    {
        int len = s.length();
        dp = new boolean[len][len];
        List<List<String>> ans = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), ans, len);
       return ans;
    }
    public static void main(String[] args) {
        String s = "Rajat";
        PalindromePartioning ob = new PalindromePartioning();
        System.out.println(ob.palindromelist(s));
    }
}
