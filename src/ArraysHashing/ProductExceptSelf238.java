package ArraysHashing;

import java.util.Arrays;

public class ProductExceptSelf238 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})));
    }

    // Time: O(n) — three passes through the array
    // Space: O(n) — left, right, and ans

   /* public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] left = new int[n];

        left[0] = 1;
        for(int i = 1;i<n;i++){
            left[i] = left[i-1]*nums[i-1];
        }

        int[] right = new int[n];

        right[n-1] = 1;
        for(int i = n-2;i>=0;i--){
            right[i] = right[i+1]*nums[i+1];
        }

        int[] ans = new int[n];

        for(int i = 0;i<n;i++){
            ans[i] = left[i]*right[i];
        }
        return ans;
    } */

    // Time: O(n) — three passes through the array
    // Space: O(1) —  ans

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] ans = new int[n];

        ans[0] = 1;
        for(int i = 1;i<n;i++){
            ans[i] = ans[i-1]*nums[i-1];
        }


        int right = 1;

        for(int i = n-1;i>=0;i--){
            ans[i] = ans[i]*right;
            right *= nums[i];
        }
        return ans;
    }
}
