


public class RadixSort {
    private int findMax(int[] nums){
        int max = nums[0];
        int len = nums.length;
        for (int i = 1; i < len; i++){
            max = Math.max(max, nums[i]);
        }
        return max;
    }
    private void countsort(int[] nums, int n, int dividend){
     int[] temp = nums.clone();
     int count[] = new int[10];
     for (int i = 0; i < n; i++)
     {
        count[temp[i] / dividend % 10]++;
     }
     for (int i = 1; i < 10; i++){
        count[i] += count[i - 1];
     }
     for (int i = n - 1; i >= 0; i--){
        nums[count[temp[i] / dividend % 10] - 1] = temp[i];//For index we are doing - 1 and that will do it
        count[temp[i] / dividend % 10]--;
     }
    }
    private void radixSort(int[] nums){
        int n = nums.length;
        int m = findMax(nums);
        for (int div = 1; m / div > 0; div *= 10){
            countsort(nums, n, div);
        }
    }
        public static void main(String[] args){
            RadixSort ob = new RadixSort();
            int[] nums = {9, 6, 4, 3, 3, 2};
            ob.radixSort(nums);
            int len = nums.length;
            for (int i = 0; i < len; i++){
                System.out.print(nums[i] + " ");
            }
           System.out.println();
        }
    }
