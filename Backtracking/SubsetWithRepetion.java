
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SubsetWithRepetion {
    private static void backtrack(int[] nums, int idx, List<Integer> ds, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(ds)); // Always add the current subset
        for (int i = idx; i < nums.length; i++) {
            if (i > idx && nums[i] == nums[i - 1]) continue; // skip duplicates
            ds.add(nums[i]);
            backtrack(nums, i + 1, ds, ans);
            ds.remove(ds.size() - 1); // backtrack
        }
    }
    private static void backtrack(int nums[], int idx, List<Integer> ds, List<List<Integer>> ans, int len)
    {
        if (idx == len){
            ans.add(new ArrayList<>(ds)); return;
        }
          ds.add(nums[idx]);
        backtrack(nums, idx + 1, ds, ans, len);
        while (idx + 1 < len && nums[idx] == nums[idx + 1]) idx++;//We add before the backtracking step to ensure it
        ds.remove(ds.size() - 1);
        backtrack(nums, idx + 1, ds, ans, len);
      
    }
    public static List<List<Integer>> subsets(int nums[])
    {
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;

        Arrays.sort(nums);
        backtrack(nums, 0, new ArrayList<>(), ans, len);
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 2};
        System.out.println(subsets(nums));
    }
}
