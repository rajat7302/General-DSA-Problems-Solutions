import java.util.ArrayList;
import java.util.List;
public class CombinationSum1 {
    private void backtrack(int target, int nums[], int n, int idx, List<Integer> ds, List<List<Integer>> ans)
    {
      if (target == 0)
      {
        ans.add(new ArrayList<>(ds));
        return;
      }
      if (target < 0 || idx == n)
      {
        return;
      }
      ds.add(nums[idx]);
      backtrack(target - nums[idx], nums, n, idx, ds, ans);// This is for choice repetition is allowed
      ds.remove(ds.size() - 1);//Backtracking step
      backtrack(target, nums, n, idx + 1, ds, ans);// This is for the thing we exclude the choice
    }
    public List<List<Integer>> combination1(int nums[], int target)
    {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        backtrack(target, nums, n, 0, new ArrayList<>(), ans);
        return ans;
    }
    public static void main(String[] args)
    {
        CombinationSum1 ob = new CombinationSum1();
        int nums[] = {1, 2, 3, 4, 5};
        System.out.println("The combinations are " + ob.combination1(nums, 5));
    }
}
