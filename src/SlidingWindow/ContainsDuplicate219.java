package SlidingWindow;

import java.util.HashSet;

public class ContainsDuplicate219 {
    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1},3));
        System.out.println(containsNearbyDuplicate(new int[]{1, 0, 1, 1},1));
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3},2));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        int l = 0;
        int r = 0;

        while(r < nums.length){

            if(r-l>k){
                set.remove(nums[l]);
                l++;
            }
            if(set.contains(nums[r])){
                return true;
            }
            set.add(nums[r]);
            r++;
        }
        return false;
    }
}
