public class bottomup {
    public static int knapsack(int val[], int wt[], int W, int n)
    {
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 1; i < n + 1; i++)
        {
            for (int j = 1; j < W + 1; j++)
            {
                if (wt[i - 1] <= j) dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1] [j]);
                else dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[n][W];
    }
    public static void main(String args[])
    {
     int wt[] = {10, 40, 20, 30};
     int val[] = { 60, 40, 90, 120 };
     int cap = 50;
     System.out.println("The maximum profit is " + knapsack(val, wt, cap, 4));
    }
}
//This is the bottom up version of the code
