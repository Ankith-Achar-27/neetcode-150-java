
package SlidingWindow;

import java.util.HashSet;

public class LongestSubstring3 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
    }

    public static int lengthOfLongestSubstring(String s) {

        int max = 0;
        int left = 0;

        // Stores characters currently present in the sliding window.
        HashSet<Character> set = new HashSet<>();

        // Expand the window by moving the right pointer.
        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // If a duplicate is found, shrink the window from the left
            // until the duplicate character is removed.
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add the current character to the window.
            set.add(ch);

            // Update the maximum length of the substring without duplicates.
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
