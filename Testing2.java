
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Testing2{
    public static long sum(int nums[])
    {
        int len = nums.length;
        boolean prime[] = new boolean[len];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i * i < len; i++)
        {
            if(prime[i]){
            for (int j = i * i; j < len; j += i)
            {
             prime[j] = false;
            }
        }
        }
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
       for (int i = 0; i < len; i++)
       {
        if(prime[i]) arr1.add(nums[i]);
        else arr2.add(nums[i]);
       }
        long sum1 = 0, sum2 = 0;
        int size1 = arr1.size(), size2 = arr2.size();
        for (int i = 0; i < size1; i++)
        {
            sum1 += arr1.get(i);
        }
        for (int j = 0; j < size2; j++)
        {
            sum2 += arr2.get(j);
        }
        return Math.abs(sum1 - sum2);
    }
    public static void main(String args[])
    {
      int arr[] = {1, 2, 3, 4, 5, 4, 5, 5,5,5};
      System.out.println("The difference is " + sum(arr));
    }
}