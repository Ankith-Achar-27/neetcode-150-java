package TwoPointers;

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TwoSum2().twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(new TwoSum2().twoSum(new int[]{2,3,4}, 6)));
        System.out.println(Arrays.toString(new TwoSum2().twoSum(new int[]{-1,0}, -1)));
    }
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while(left<right){
            int sum = numbers[left]+numbers[right];

            if(sum == target){
                return new int[]{left+1,right+1};
            }

            if(sum < target){
                left++;
            }

            if(sum > target){
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}
