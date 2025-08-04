

public class MaxProduct {
    public int maxProduct(int nums[])
    {
        int len = nums.length;
        int maxProd = nums[0], minProd = nums[0], currProd = nums[0];
        for (int i = 1; i < len; i++)
        {
            int temp = currProd;
            currProd = Math.max(Math.max(currProd * nums[i], minProd * nums[i]), nums[i]);
            minProd = Math.min(Math.min(temp * nums[i], minProd * nums[i]), nums[i]);
            maxProd = Math.max(currProd, maxProd);
        }
        return maxProd;
    }
    public static void main(String[] args) {
        int nums[] = {-2, 3, -4};
        MaxProduct ob = new MaxProduct();
        System.out.println("The maximum product is "+ob.maxProduct((nums)));
    }
}
