package Sorting;

public class CountSort {
    private void countSort(int[] nums, int lowerRange, int higherRange){
        int len = nums.length;
        int range = higherRange - lowerRange + 1;
        int[] count = new int[range];
        for (int i = 0; i < len; i++){
            count[nums[i] - lowerRange]++;
        }
        int j = 0; 
        for (int i = 0; i < range; i++){
            for (; count[i] > 0; count[i]--){
                nums[j++] = i + lowerRange;
            }
        }
    }
        public static void main(String[] args){
            CountSort ob = new CountSort();
            int[] nums = {9, 6, 5, 2, 1};
            count
        }
    }
