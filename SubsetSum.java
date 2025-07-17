public class SubsetSum {
    private boolean subsetSum(int nums[], int target, int n)
    {//Recurrence relation for recursion is T(n) = T(n - 1) + 1 that is 2^n for recursion but for dp it is n ^ 2 only
        boolean dp[][] = new boolean[n + 1][target + 1];
        for (int i = 0; i < n + 1; i++)
        {
            for (int j = 0; j < target + 1; j ++)
            {
                if (j == 0) dp[i][j] = true;
            }
        }
        for (int i = 1; i < n + 1; i++)
        {
            for (int j = 1; j < target + 1; j++)
            {
                if (nums[i - 1] <= j) dp[i][j] = dp[i][j - nums[i - 1]] || dp[i - 1][j];
                else dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[n][target];
    }
    public static void main(String[] args)
    {
      SubsetSum ob = new SubsetSum();
      int nums[] = {2, 3, 10, 8, 10};
      int sum = 20;
      System.out.println(ob.subsetSum(nums, sum, 5));
    }
}
//To find all the subsets we have to use backtracking and not this