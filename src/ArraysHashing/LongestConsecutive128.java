package ArraysHashing;

import java.util.*;

public class LongestConsecutive128 {
    public static void main(String[] args) {
        System.out.println("Test Case 1: " + longestConsecutive(new int[]{100,4,200,1,3,2}));
        System.out.println("Test Case 2: " + longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
        System.out.println("Test Case 3: " + longestConsecutive(new int[]{1,0,1,2}));
    }
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int longest = 0;

        for(int num : set){
            if(!set.contains(num-1)){
                int curr = num;
                int length = 1;

                while(set.contains(curr+1)){
                    curr = curr+1;
                    length++;
                }

                longest = Integer.max(longest,length);
            }
        }
        return longest;
    }
}
