public class CountOfSubsets
{
    public int countOfSubsets(int nums[], int target, int n)
    {
        int dp[][] = new int[n + 1][target + 1];
        for (int i = 0; i < n + 1; i++)
        {
            dp[i][0] = 1;
        }
        for (int i = 1; i < n + 1; i++)
        {
            for (int j = 1; j < target + 1; j++)
            {
                if (nums[i - 1] <= j)
                 dp[i][j] = dp[i - 1][j] + dp[i - 1][j - nums[i - 1]];
                else dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[n][target];
    }
    public static void main(String[] args)
    {
      CountOfSubsets ob = new CountOfSubsets();
      int nums[] = {2, 3, 5, 6, 8, 10};
      int target = 10;
      System.out.println(" The number of subsets are " + ob.countOfSubsets(nums, target, 6));
    }
}