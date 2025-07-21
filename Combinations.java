import java.util.ArrayList;
import java.util.List;
public class Combinations {
    private static void backtrack(int nums[], List<Integer> ds, List<List<Integer>> ans, int n, int idx, int k)
    {
      if (ds.size() == k)
      {
        ans.add(new ArrayList<>(ds));
        return;
      }
      for (int i = idx; i < n; i++)
      {
         ds.add(nums[i]);
         backtrack(nums, ds, ans, n, i + 1, k);
         ds.remove(ds.size() -1);
      }
    }
    public static List<List<Integer>> combinations(int n ,int k)
    {
        int nums[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            nums[i] = i + 1;
        }
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), ans, n, 0, k);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Combinations are " +combinations(5, 2));
    }
}
