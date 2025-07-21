
public class FixedSlidingWindow {
    public static int maxSum(int nums[], int k)
    {
        int len = nums.length;
         if (k > len) throw new IllegalStateException("Wrong Input");
        int currSum = 0, maxSum = 0;
        for (int i = 0; i < k; i++)
        {
             currSum += nums[i];
        }
        maxSum = currSum;
        for (int i = k; i < len; i++)
        {
            currSum += nums[i] - nums[i - k];
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
    public static void main(String args[])
    {
        int nums[] = {1, 2, 3, 4, 4, 5, 2};
        int k = 3;
        System.out.println("The maximum subarray is " + maxSum(nums, k));
    }
}
