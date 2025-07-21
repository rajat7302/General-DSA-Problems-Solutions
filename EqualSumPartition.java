public class EqualSumPartition {
    boolean equalSumPartition(int nums[], int n)
    {
        int target = 0;
        for (int i = 0 ; i < n; i++)
        {
           target += nums[i];
        }
        if (target % 2 != 0) return false;
        int p = target / 2;
        boolean dp[][] = new boolean[n + 1][p + 1];
        for (int i = 0; i < n + 1; i ++)
        {
            dp[i][0] = true;
        }
        for (int i = 1; i < n + 1; i++)
        {
            for (int j = 1; j < p + 1; j++)
            {
                if (nums[i - 1] <= j) dp[i][j] = dp[i - 1][j - nums[i - 1]] || dp[i - 1][j];
                else dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[n][p];
    }
    public static void main(String args[])
    {
     EqualSumPartition ob = new EqualSumPartition();
     int nums[] = {1, 5, 11, 5};
     System.out.println("Result: " +ob.equalSumPartition(nums, 4));
    }
}
