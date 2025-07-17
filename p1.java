
public class p1 {
    static int dp[][] = new int[100][1000];
    public static int knapsack(int val[], int wt[], int W, int n)
    {if (n == 0 || W == 0) return 0;
        if (dp[n][W] != -1) return dp[n][W];
        if (wt[n - 1] <= W)
        { 
            return dp[n][W] = Math.max(val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1), knapsack(val, wt, W, n - 1));
        }
        else{ 
     return  dp[n][W] = knapsack(val, wt, W, n - 1);}
    }
    public static void main(String args[])
    {
     int wt[] = {10, 40, 20, 30};
     int val[] = { 60, 40, 90, 120 };
     int cap = 50;
     for (int i = 0; i < 100; i++)
     {
        for (int j = 0; j < 1000; j++)
        {
            dp[i][j] = -1;
        }
     }
     System.out.println("The maximum profit is " + knapsack(val, wt, cap, 4));
    }
}
//This is the memosized version of the code