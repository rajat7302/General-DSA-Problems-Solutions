
public class MaxProduct {
    public int maxProduct(int nums[])
    {
        int len = nums.length;
        int currProd = nums[0], maxProd = nums[0], minProd = nums[0];
        for (int i = 1; i < len; i++)
        {
            int temp = currProd;
           currProd = Math.max(Math.max(currProd * nums[i], minProd * nums[i]), nums[i]);
           minProd = Math.min(Math.min(minProd * nums[i], temp * nums[i]) , nums[i]);
           maxProd = Math.max(maxProd, currProd);
        }
        return maxProd;
    }
}
