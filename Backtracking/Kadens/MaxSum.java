public class MaxSum {
    public static int maxSum(int nums[])
    {
        int len = nums.length;
        int currSum = nums[0], maxSum = nums[0];
        for (int i = 1; i < len; i++)
        {
            currSum = Math.max(currSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 4, -2, 3, 4};
    System.out.println("The maximum sum is :" + maxSum(arr));// Kaden's algorithm gives the sum of maximum contiguous array
}
}
