public class ProductOfSelf {
    public int productSelf(int nums[])
    {
        int len = nums.length;
        int prod = 1;
        int count = 0;
        for (int i = 0; i < len; i++)
        {
            if (nums[i] == 0) count++;
            else prod *= nums[i];
        }
        if (count == 0)
        {
                
        }
    }
}
