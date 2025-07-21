import java.util.ArrayList;
import java.util.List;
public class Subset {
    public static void printSubsets(int nums[], List<List<Integer>> ans, List<Integer> ds, int n, int idx)
    {
      if (idx == n)
      {
        ans.add(new ArrayList<>(ds));
        return;
      }
      ds.add(nums[idx]);
      printSubsets(nums, ans, ds, n, idx + 1);
      ds.remove(ds.size() - 1);
      printSubsets(nums, ans, ds, n, idx + 1);//Backtracking
    }
    public static List<List<Integer>> allSubsets(int nums[])
    {
     List<List<Integer>> ans = new ArrayList<>();
     int n = nums.length;
     printSubsets(nums, ans, new ArrayList<>(), n, 0);
     return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        System.out.println("The subsets are :" + allSubsets(nums));
    }
}
