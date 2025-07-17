import java.util.*;

public class CountOfSubsets2 {
    public int countSubsetsMemo(int[] nums, int n, int sum, int[][] memo) {
        if (sum == 0) return 1;
        if (n == 0) return 0;
        
        if (memo[n][sum] != -1) return memo[n][sum];
        
        if (nums[n - 1] <= sum)
            memo[n][sum] = countSubsetsMemo(nums, n - 1, sum, memo) +
                           countSubsetsMemo(nums, n - 1, sum - nums[n - 1], memo);
        else
            memo[n][sum] = countSubsetsMemo(nums, n - 1, sum, memo);
        
        return memo[n][sum];
    }

    public static void main(String[] args) {
        CountOfSubsets2 ob = new CountOfSubsets2();
        int nums[] = {2, 3, 5, 6, 8, 10};
        int target = 10;
        int[][] memo = new int[nums.length + 1][target + 1];
        for (int[] row : memo) Arrays.fill(row, -1);
        
        System.out.println("Number of subsets: " + ob.countSubsetsMemo(nums, nums.length, target, memo));
    }
}
