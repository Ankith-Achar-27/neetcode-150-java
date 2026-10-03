package TwoPointers;

import static java.lang.Character.toLowerCase;

public class ValidPalindrome125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome2("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome2("race a car"));
        System.out.println(isPalindrome2(""));
    }

    // 1 . Time Complexity: O(n)  Space Complexity: O(n)
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        if (s.length() <= 1) return true;

        for (int i = 0; i < s.length(); i++) {
            if(!Character.isLetterOrDigit(s.charAt(i))){
                continue;
            }
            sb.append(Character.toLowerCase(s.charAt(i)));
        }
        int left = 0;
        int right = sb.length() - 1;
        while (left < right) {
            if(sb.charAt(left) != sb.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // 2 . Time Complexity: O(n)  Space Complexity: O(1)

    public static boolean isPalindrome2(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
